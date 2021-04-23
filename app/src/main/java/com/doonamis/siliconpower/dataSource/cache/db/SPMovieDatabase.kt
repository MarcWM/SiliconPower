package com.doonamis.siliconpower.dataSource.cache.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.doonamis.siliconpower.dataSource.cache.model.MovieEntity

@Database(entities = [MovieEntity::class], version = 2)
@TypeConverters(Converters::class)
abstract class SPMovieDatabase: RoomDatabase() {

    abstract fun movieDao(): SPMovieDao

    companion object {
        const val DATABASE_NAME: String = "word_db"
    }
}