package com.anupkunwar.samachar.model

data class News(
    val title: String,
    val description: String,
    val link: String,
    val pubDate: String,
    val image: String? = null
)