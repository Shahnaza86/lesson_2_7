package com.example.lesson_2_7.domain.di

import android.content.Context
import androidx.room.Room
import com.example.lesson_2_7.data.local.KoranDao
import com.example.lesson_2_7.data.local.KoranDataBase
import com.example.lesson_2_7.data.repositories.KoranRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object KoranModule {

    @Singleton
    @Provides
    fun provideKoranDataBase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        KoranDataBase::class.java,
        "koran"
    )

    @Provides
    fun provideKoranDao(koranDataBase: KoranDataBase) = koranDataBase.koranDao()

    @Provides
    fun provideKoranRepository(koranDao: KoranDao) = KoranRepositoryImpl(koranDao)
}