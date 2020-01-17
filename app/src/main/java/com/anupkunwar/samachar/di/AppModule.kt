package com.anupkunwar.samachar.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.anupkunwar.samachar.AppCoroutineDispatcher
import com.anupkunwar.samachar.MyApp
import com.anupkunwar.samachar.db.PublisherDatabase
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

    @Singleton
    @Provides
    fun providePublisherDatabase(context: Context): PublisherDatabase {
        return Room.databaseBuilder(context, PublisherDatabase::class.java, "publisher_db").build()
    }


}