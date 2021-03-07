package com.devtech.whatsappdirect.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.devtech.countries_repository.Country
import com.devtech.whatsappdirect.databinding.CountryCardBinding

class CountriesAdapter(private val onClicked: (country: Country) -> Unit) : ListAdapter<Country, CountriesAdapter.CountryViewHolder>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Country>() {
            override fun areItemsTheSame(oldItem: Country, newItem: Country): Boolean {
                return oldItem.numericCode == newItem.numericCode
            }

            override fun areContentsTheSame(oldItem: Country, newItem: Country): Boolean {
                return oldItem == newItem
            }
        }
    }

    inner class CountryViewHolder(val binding: CountryCardBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CountryViewHolder(
        CountryCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        if (position == RecyclerView.NO_POSITION) return
        val country = getItem(position)
        val text = "(+${country.numericCode}) ${country.name}"
        holder.binding.img.setImageResource(country.drawableId)
        holder.binding.name.text = text
        holder.binding.root.setOnClickListener { onClicked(country) }
    }

}