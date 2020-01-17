package com.anupkunwar.samachar.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.anupkunwar.samachar.model.Language


@Entity(tableName = "publisher_table")
@TypeConverters(Language.LanguageConverter::class)
data class PublisherEntity(
    @ColumnInfo(name = "name")
    val name: String,
    @PrimaryKey @ColumnInfo(name = "slug")
    val slug: String,
    @ColumnInfo(name = "logo")
    val logo: Int,
    @ColumnInfo(name = "feed_url")
    val feedUrl: String,
    @ColumnInfo(name = "language")
    val language: Language,
    @ColumnInfo(name = "selected")
    val selected: Boolean = false
)