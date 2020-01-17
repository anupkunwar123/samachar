package com.anupkunwar.samachar.publisher.impl

import com.anupkunwar.samachar.NewsService
import com.anupkunwar.samachar.model.Language
import com.anupkunwar.samachar.model.News
import com.anupkunwar.samachar.model.PUBLISHER_LIST
import com.anupkunwar.samachar.model.Publisher
import com.anupkunwar.samachar.publisher.PublisherRepository
import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml
import javax.inject.Inject

class BBCRepository @Inject constructor(
    private val newsService: NewsService
) :
    PublisherRepository {
    override fun getPublisher(): Publisher {
//        val response =
//            newsService.getBBCRss("http://feeds.bbci.co.uk/nepali/rss.xml").execute().body()!!
//        return Publisher(
//            name = response.channel.title,
//            description = response.channel.description,
//            logo = response.channel.image.link,
//            language = Language.NEPALI,
//            news = response.channel.items.map {
//                News(
//                    title = it.title,
//                    description = it.description,
//                    pubDate = it.pubDate,
//                    link = it.link,
//                    publisher = Publisher(
//                        name = response.channel.title,
//                        description = response.channel.description,
//                        logo = response.channel.image.link,
//                        language = Language.NEPALI
//                    )
//                )
//            }
//        )
        return PUBLISHER_LIST[0]

    }


    @Xml
    data class RssFeed(
        @Element
        val channel: Channel

    )

    @Xml
    data class Channel(
        @PropertyElement
        val title: String,
        @PropertyElement
        val description: String,
        @PropertyElement
        val link: String,
        @Element
        val image: Image,
        @PropertyElement
        val language: String,
        @Element
        val items: List<Item>
    )



    @Xml
    data class Image(
        @PropertyElement
        val url: String,
        @PropertyElement
        val title: String,
        @PropertyElement
        val link: String
    )

    @Xml
    data class Item(
        @PropertyElement
        val title: String,
        @PropertyElement
        val description: String,
        @PropertyElement
        val link: String,
        @PropertyElement
        val pubDate: String
    )

}

