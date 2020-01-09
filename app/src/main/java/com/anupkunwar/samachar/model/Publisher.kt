package com.anupkunwar.samachar.model

import com.anupkunwar.samachar.R

data class Publisher(
    val name: String,
    val slug: String,
    val logo: Int? = null,
    val feedUrl: String,
    val news: List<News>? = null,
    val language: Language
)

enum class Language {
    NEPALI, ENGLISH
}

val PUBLISHER_LIST = mutableListOf(
    Publisher(
        name = "BBC Nepali",
        slug = "bbc_nepali",
        feedUrl = "http://feeds.bbci.co.uk/nepali/rss.xml",
        language = Language.NEPALI,
        logo = R.drawable.bbc
    ),
    Publisher(
        name = "Online Khabar",
        slug = "online_khabar",
        feedUrl = "https://www.onlinekhabar.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.online_khabar
    ),
    Publisher(
        name = "Online Khabar English",
        slug = "online_khabar_eng",
        feedUrl = "https://english.onlinekhabar.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.online_khabar_english
    ),
    Publisher(
        name = "Ratopati English",
        slug = "rato_pati_eng",
        feedUrl = "http://www.english.ratopati.com/rss",
        language = Language.ENGLISH,
        logo = R.drawable.rato_pati_eng
    ),
    Publisher(
        name = "Ratopati",
        slug = "rato_pati",
        feedUrl = "http://www.ratopati.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.rato_pati
    ),
    Publisher(
        name = "Khabarhub",
        slug = "khabar_hub",
        feedUrl = "https://www.khabarhub.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.khabar_hub
    ),
    Publisher(
        name = "Khabarhub English",
        slug = "khabar_hub",
        feedUrl = "https://english.khabarhub.com/rss",
        language = Language.ENGLISH,
        logo = R.drawable.khabar_hub
    ),
    Publisher(
        name = "Thaha Khabar",
        slug = "thaha_khabar",
        feedUrl = "http://www.thahakhabar.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.thaha_khabar
    ),
    Publisher(
        name = "News 24 Nepal",
        slug = "news_24_nepal",
        feedUrl = "https://www.news24nepal.tv/feed",
        language = Language.NEPALI,
        logo = R.drawable.news_24_nepal
    ),
    Publisher(
        name = "Nagarik Network",
        slug = "nagarik_network",
        feedUrl = "https://www.nagariknetwork.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.nagarik_network
    ),
    Publisher(
        name = "Dainik Online",
        slug = "dainik_online",
        feedUrl = "https://dainikonline.info/rss",
        language = Language.ENGLISH,
        logo = R.drawable.dainik_online
    ),
    Publisher(
        name = "Sanchar Kendra",
        slug = "sanchar_kendra",
        feedUrl = "https://sancharkendra.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.sanchar_kendra
    ),
    Publisher(
        name = "Sanchar Kendra English",
        slug = "sanchar_kendra_eng",
        feedUrl = "https://sancharkendra.com/archives/category/english/rss",
        language = Language.ENGLISH,
        logo = R.drawable.sanchar_kendra
    ),
    Publisher(
        name = "Seto Pati",
        slug = "seto_pati",
        feedUrl = "https://www.setopati.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.seto_pati
    ),
    Publisher(
        name = "Reporters Nepal",
        slug = "reporters_nepal",
        feedUrl = "https://www.reportersnepal.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.reporters_nepal
    ),
    Publisher(
        name = "Reporters Nepal English",
        slug = "reporters_nepal_eng",
        feedUrl = "https://en.reportersnepal.com/rss",
        language = Language.ENGLISH,
        logo = R.drawable.reporters_nepal
    ),
    Publisher(
        name = "Naya Page",
        slug = "naya_page",
        feedUrl = "https://en.reportersnepal.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.naya_page
    ), Publisher(
        name = "Naya Page English",
        slug = "naya_page_eng",
        feedUrl = "https://www.nayapage.com/archives/category/english/rss",
        language = Language.ENGLISH,
        logo = R.drawable.naya_page
    ), Publisher(
        name = "Prashan",
        slug = "prashan",
        feedUrl = "https://www.prasashan.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.prashan
    ), Publisher(
        name = "Prashan English",
        slug = "prashan_eng",
        feedUrl = "https://www.prasashan.com/category/english/rss",
        language = Language.ENGLISH,
        logo = R.drawable.prashan
    ), Publisher(
        name = "The Nepal Top",
        slug = "the_nepal_top",
        feedUrl = "https://www.thenepaltop.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.the_nepal_top
    ), Publisher(
        name = "Lokaantar",
        slug = "lokaantar",
        feedUrl = "https://lokaantar.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.lokaantar
    ), Publisher(
        name = "Lokaantar English",
        slug = "lokaantar_eng",
        feedUrl = "http://www.english.lokaantar.com/rss",
        language = Language.ENGLISH,
        logo = R.drawable.lokaantar_eng
    ), Publisher(
        name = "Purbeli News",
        slug = "purbeli_news",
        feedUrl = "http://www.purbelinews.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.purbeli_news
    ), Publisher(
        name = "Purbeli News English",
        slug = "purbeli_news_eng",
        feedUrl = "http://purbelinews.net/rss",
        language = Language.ENGLISH,
        logo = R.drawable.purbeli_news_eng
    ), Publisher(
        name = "Media Dabali",
        slug = "media_dabali",
        feedUrl = "https://mediadabali.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.media_dabali
    ), Publisher(
        name = "Media Dabali English",
        slug = "media_dabali_eng",
        feedUrl = "https://mediadabali.com/content/english/rss",
        language = Language.ENGLISH,
        logo = R.drawable.media_dabali
    ), Publisher(
        name = "DC Nepal",
        slug = "dc_nepal",
        feedUrl = "https://www.dcnepal.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.dc_nepal
    ), Publisher(
        name = "Koshi Online",
        slug = "koshi_online",
        feedUrl = "https://www.koshionline.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.koshi_online
    ), Publisher(
        name = "Lokpath",
        slug = "lokpath",
        feedUrl = "https://www.lokpath.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.lokpath
    ), Publisher(
        name = "Lokpath",
        slug = "lokpath",
        feedUrl = "https://english.lokpath.com/rss",
        language = Language.ENGLISH,
        logo = R.drawable.lokpath
    ), Publisher(
        name = "Janata Samachar",
        slug = "janata_samachar",
        feedUrl = "https://www.janatasamachar.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.janata_samachar
    ), Publisher(
        name = "Kathmandu Pati",
        slug = "kathmandu_pati",
        feedUrl = "https://www.kathmandupati.com/rss",
        language = Language.NEPALI,
        logo = R.drawable.kathmandu_pati
    ), Publisher(
        name = "Kathmandu Pati English",
        slug = "kathmandu_pati_eng",
        feedUrl = "https://www.kathmandupati.com/news/category/english/rss",
        language = Language.ENGLISH,
        logo = R.drawable.kathmandu_pati
    ), Publisher(
        name = "Kathmandu Post",
        slug = "kathmandu_post",
        feedUrl = "https://kathmandupost.com/rss",
        language = Language.ENGLISH,
        logo = R.drawable.kathmandu_post
    )


)