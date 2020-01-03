package com.anupkunwar.samachar.di

import android.app.Application
import com.anupkunwar.samachar.NewsService
import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import timber.log.Timber
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetModule {
    @Singleton
    @Provides
    fun getRetrofit(
        @Named("BASE_URL") baseUrl: String, converterFactory: Converter.Factory,
        okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(converterFactory)
            .client(okHttpClient)
            .baseUrl(baseUrl)
            .build()
    }


    @Singleton
    @Provides
    @Named("BASE_URL")
    fun getBaseUrl(): String {
        return "https://www.anup.com/"
    }


    @Singleton
    @Provides
    fun getOkHttp(
        cache: Cache,
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .connectTimeout(60L, TimeUnit.SECONDS)
            .readTimeout(60L, TimeUnit.SECONDS)
            .cache(cache)
            .build()
    }

    @Singleton
    @Provides
    fun getConverterFactory(): Converter.Factory {
        return TikXmlConverterFactory.create(TikXml.Builder().exceptionOnUnreadXml(false).build())
    }

    @Singleton
    @Provides
    fun getOkHttpLoginInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor(HttpLoggingInterceptor.Logger {
            Timber.tag("OKHttp").d(it)
        }).setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Singleton
    @Provides
    fun getOkHttpCache(app: Application): Cache {
        return Cache(app.cacheDir, (15 * 1024 * 1024))
    }

    @Singleton
    @Provides
    fun provideNewsService(retrofit: Retrofit): NewsService {
        return retrofit.create(NewsService::class.java)
    }

}