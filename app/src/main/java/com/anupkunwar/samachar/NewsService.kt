package com.anupkunwar.samachar

import com.anupkunwar.samachar.publisher.impl.BBCRepository
import com.anupkunwar.samachar.publisher.impl.SetoPatiRepository
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface NewsService {
    @GET
    fun getBBCRss(@Url bbcRssUrl: String): Call<BBCRepository.RssFeed>

    @GET
    fun getSetoPatiRss(@Url setoPatiUrl: String): Call<BBCRepository.RssFeed>

    @GET
    fun getOnlineKhabarRss(@Url onlinekhabarUrl: String): Call<BBCRepository.RssFeed>
}