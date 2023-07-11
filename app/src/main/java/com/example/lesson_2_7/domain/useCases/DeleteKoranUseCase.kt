package com.example.lesson_2_7.domain.useCases

import com.example.lesson_2_7.domain.models.Koran
import com.example.lesson_2_7.domain.repositories.KoranRepository
import javax.inject.Inject


class DeleteKoranUseCase @Inject constructor(
    private val koranRepository: KoranRepository
) {
    fun deleteKoran(koran: Koran) {
        koranRepository.deleteKoran(koran)
    }
}