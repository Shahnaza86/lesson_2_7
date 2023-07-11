package com.example.lesson_2_7.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "koran")
data class KoranEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val reader: String,
    val sura: String,
    val duration: String
)