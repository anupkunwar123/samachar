package com.anupkunwar.samachar.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.anupkunwar.samachar.db.entity.PublisherEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface PublisherEntityDao {

    @Query("SELECT * from publisher_table")
    fun getPublisherList(): Flow<List<PublisherEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(publisherEntityList: List<PublisherEntity>)
}