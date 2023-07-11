package com.example.lesson_2_7.data.local

import androidx.room.*
import com.example.lesson_2_7.data.models.KoranEntity

@Dao
interface KoranDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addKoran(koranEntity: KoranEntity)

    @Query("SELECT * FROM koran")
    suspend fun getKoran(): List<KoranEntity>

    @Query("SELECT * FROM koran ORDER BY reader ASC")
    suspend fun readerKoran(): List<KoranEntity>

    @Query("SELECT * FROM koran ORDER BY CAST(duration " + "AS INTEGER) ASC")
    suspend fun durationKoran(): List<KoranEntity>

    @Update
    suspend fun updateKoran(koranEntity: KoranEntity)

    @Delete
    suspend fun deleteKoran(koranEntity: KoranEntity)

}