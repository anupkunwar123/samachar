package com.anupkunwar.samachar.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anupkunwar.samachar.databinding.ItemNewsBinding
import com.anupkunwar.samachar.model.News
import com.anupkunwar.samachar.model.NewsDiff
import javax.inject.Inject

class NewsAdapter @Inject constructor() : ListAdapter<News, NewsAdapter.NewsViewHolder>(NewsDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            ItemNewsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class NewsViewHolder(private val binding: ItemNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(news: News) {
            binding.item = news
            binding.executePendingBindings()
        }
    }
}
