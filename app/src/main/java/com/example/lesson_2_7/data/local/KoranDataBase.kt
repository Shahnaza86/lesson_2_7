package com.example.lesson_2_7.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lesson_2_7.data.models.KoranEntity

@Database(entities = [KoranEntity::class], version = 1)
abstract class KoranDataBase: RoomDatabase() {
    abstract fun koranDao(): KoranDao
}