package com.anupkunwar.samachar.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anupkunwar.samachar.databinding.ItemPublisherBinding
import com.anupkunwar.samachar.model.Publisher
import com.anupkunwar.samachar.model.PublisherDiff
import javax.inject.Inject

class SelectPublisherAdapter @Inject constructor() :
    ListAdapter<Publisher, SelectPublisherAdapter.SelectPublisherViewHolder>(PublisherDiff) {


    class SelectPublisherViewHolder(private val binding: ItemPublisherBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(publisher: Publisher) {
            binding.run {
                this.item = publisher
                executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectPublisherViewHolder {
        val binding =
            ItemPublisherBinding.inflate(LayoutInflater.from(parent.context), parent, false).apply {

            }
        return SelectPublisherViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SelectPublisherViewHolder, position: Int) {
        holder.bind(getItem(position))
    }




}