package com.anupkunwar.samachar.publisher.impl

import com.anupkunwar.samachar.NewsService
import com.anupkunwar.samachar.model.Language
import com.anupkunwar.samachar.model.News
import com.anupkunwar.samachar.model.Publisher
import com.anupkunwar.samachar.publisher.PublisherRepository
import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml
import javax.inject.Inject

class SetoPatiRepository @Inject constructor(private val newsService: NewsService) :
    PublisherRepository {
    override fun getPublisher(): Publisher {
        val response =
            newsService.getSetoPatiRss("https://www.setopati.com/feed").execute().body()!!
        return Publisher(
            name = response.channel.title,
            description = response.channel.description,
            logo = response.channel.image.link,
            language = Language.NEPALI,
            news = response.channel.items.map {
                News(
                    title = it.title,
                    description = it.description,
                    pubDate = it.pubDate,
                    link = it.link,
                    publisher = Publisher(
                        name = response.channel.title,
                        description = response.channel.description,
                        logo = response.channel.image.link,
                        language = Language.NEPALI
                    )
                )
            }
        )
    }

}