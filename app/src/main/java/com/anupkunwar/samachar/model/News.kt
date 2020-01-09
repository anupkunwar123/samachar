package com.anupkunwar.samachar.model

import androidx.recyclerview.widget.DiffUtil

data class News(
    val title: String,
    val description: String,
    val link: String,
    val pubDate: String,
    val image: String? = null,
    var publisher: Publisher? = null
)

object NewsDiff : DiffUtil.ItemCallback<News>() {
    override fun areItemsTheSame(oldItem: News, newItem: News): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: News, newItem: News): Boolean {
        return oldItem.title == newItem.title
    }

}