package com.devtech.whatsappdirect

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.devtech.whatsappdirect.databinding.ActivityMainBinding
import com.devtech.whatsappdirect.fragments.CountriesBottomSheet

class MainActivity : AppCompatActivity() {

    private val tag = "my_test"

    private lateinit var binding: ActivityMainBinding
    private var bottomSheet: CountriesBottomSheet? = null
    private var countryCode = 91

    private val countryCodeText get() = "(+$countryCode)"
    private val baseUri get() =  "whatsapp://send?phone=$phoneNo&text=$message"
    private var phoneNo: String = ""
    private var message: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getIntentData()

        binding.countryCodeText.text = countryCodeText
        bottomSheet = CountriesBottomSheet { country ->
            countryCode = country.numericCode
            binding.countryCodeText.text = countryCodeText
            binding.flagIcon.setImageResource(country.drawableId)
        }
        binding.flagIcon.setOnClickListener {
           bottomSheet?.show(supportFragmentManager, "Country Bottom Sheet")
        }

        binding.launchWhatsApp.setOnClickListener {
            val phoneTxt = binding.phoneInput.editText?.text.toString().trim()
            phoneNo = "+$countryCode $phoneTxt"
            message = binding.messageInput.editText?.text.toString().trim()
            try {
                val intent = Intent(Intent.ACTION_VIEW).apply { data = Uri.parse(baseUri) }
                startActivity(intent)
            } catch (e: Exception) {
                Log.d(tag, "onButtonClicked: $e")
                Toast.makeText(this, "WhatsApp is not installed!!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onPause() {
        if (bottomSheet?.isVisible == true)
            bottomSheet?.dismiss()
        super.onPause()
    }

    private fun getIntentData() {
        if (intent.action == Intent.ACTION_DIAL) {
            processRawText(intent.dataString?.substring(4))
        } else if (intent.action == Intent.ACTION_PROCESS_TEXT) {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                processRawText(intent.getStringExtra(Intent.EXTRA_PROCESS_TEXT))
            }
        }
    }

    private fun processRawText(phNo: String?) {
        phoneNo = phNo ?: ""
        binding.phoneInput.editText?.setText(phoneNo)
    }
}