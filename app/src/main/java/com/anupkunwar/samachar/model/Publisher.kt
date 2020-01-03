package com.anupkunwar.samachar.model

data class Publisher(
    val name: String,
    val logo: String? = null,
    val description: String? = null,
    val news: List<News>,
    val language: Language
)

enum class Language {
    NEPALI, ENGLISH, BOTH
}