package com.example.lesson_2_7.domain.useCases

import com.example.lesson_2_7.domain.models.Koran
import com.example.lesson_2_7.domain.repositories.KoranRepository
import com.example.lesson_2_7.domain.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReaderKoranUseCase @Inject constructor(
    private val koranRepository: KoranRepository
) {
    fun readerKoran(): Flow<Resource<List<Koran>>> {
        return koranRepository.readerKoran()
    }
}