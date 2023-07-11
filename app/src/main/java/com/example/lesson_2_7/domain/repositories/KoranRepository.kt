package com.example.lesson_2_7.domain.repositories


import com.example.lesson_2_7.domain.models.Koran
import com.example.lesson_2_7.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface KoranRepository {
    fun addKoran(music: Koran) : Flow<Resource<Unit>>

    fun getKoran(): Flow<Resource<List<Koran>>>

    fun readerKoran(): Flow<Resource<List<Koran>>>

    fun durationKoran(): Flow<Resource<List<Koran>>>

    fun updateKoran(koran: Koran) : Flow<Resource<Unit>>

    fun deleteKoran(koran: Koran) : Flow<Resource<Unit>>
}

