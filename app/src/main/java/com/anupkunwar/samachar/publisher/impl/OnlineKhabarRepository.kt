package com.anupkunwar.samachar.publisher.impl

import com.anupkunwar.samachar.NewsService
import com.anupkunwar.samachar.model.PUBLISHER_LIST
import com.anupkunwar.samachar.model.Publisher
import com.anupkunwar.samachar.publisher.PublisherRepository
import javax.inject.Inject

class OnlineKhabarRepository @Inject constructor(private val newsService: NewsService) :
    PublisherRepository {
    override fun getPublisher(): Publisher {
//        val response =
//            newsService.getOnlineKhabarRss("https://www.onlinekhabar.com/feed").execute().body()!!
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

}