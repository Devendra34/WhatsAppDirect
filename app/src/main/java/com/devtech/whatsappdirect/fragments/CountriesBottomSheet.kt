package com.devtech.whatsappdirect.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devtech.countries_repository.CountriesRepository
import com.devtech.countries_repository.Country
import com.devtech.whatsappdirect.R
import com.devtech.whatsappdirect.adapters.CountriesAdapter
import com.devtech.whatsappdirect.databinding.BottomSheetCountriesBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class CountriesBottomSheet(private val countrySelected: (country: Country) -> Unit) :
    BottomSheetDialogFragment() {

    private var _binding: BottomSheetCountriesBinding? = null
    private val binding get() = _binding!!

    private var adapter: CountriesAdapter? = null
    private val repository = CountriesRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.Theme_BottomSheetTheme)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetCountriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = CountriesAdapter { country ->
            dismiss()
            countrySelected(country)
        }
        binding.recyclerView.adapter = adapter
        adapter?.submitList(repository.getAllCountries())
    }

    override fun onResume() {
        super.onResume()
        binding.searchBar.editText?.addTextChangedListener(textWatcher)
    }

    override fun onPause() {
        binding.searchBar.editText?.removeTextChangedListener(textWatcher)
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            if (s.isNullOrBlank()) {
                adapter?.submitList(repository.getAllCountries())
            } else {
                adapter?.submitList(repository.getCountryList(s.toString()))
            }
        }

        override fun afterTextChanged(s: Editable?) {}

    }
}