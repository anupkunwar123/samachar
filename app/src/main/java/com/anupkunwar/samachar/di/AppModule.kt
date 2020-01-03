package com.anupkunwar.samachar.di

import android.app.Application
import android.content.Context
import com.anupkunwar.samachar.AppCoroutineDispatcher
import com.anupkunwar.samachar.MyApp
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun getApp(app: MyApp): Application {
        return app
    }

    @Singleton
    @Provides
    fun getContext(app: MyApp): Context {
        return app.applicationContext
    }

    @Singleton
    @Provides
    fun provideAppCoroutineDispatcher(): AppCoroutineDispatcher =
        AppCoroutineDispatcher(
            io = Dispatchers.IO,
            computation = Dispatchers.Default,
            main = Dispatchers.Main
        )


}