package com.anupkunwar.samachar.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.anupkunwar.samachar.db.dao.PublisherEntityDao
import com.anupkunwar.samachar.db.entity.PublisherEntity

@Database(entities = [PublisherEntity::class], version = 1)
abstract class PublisherDatabase: RoomDatabase() {
    abstract fun publisherDao(): PublisherEntityDao
}