package com.anupkunwar.samachar

import com.anupkunwar.samachar.home.BBCRepository
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface NewsService {
    @GET
    fun getBBCRss(@Url bbcRssUrl: String): Call<BBCRepository.BBCRss>
}