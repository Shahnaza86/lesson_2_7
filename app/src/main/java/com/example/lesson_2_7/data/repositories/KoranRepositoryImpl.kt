package com.example.lesson_2_7.data.repositories

import com.example.lesson_2_7.data.local.KoranDao
import com.example.lesson_2_7.data.mappers.toMusic
import com.example.lesson_2_7.data.models.KoranEntity
import com.example.lesson_2_7.domain.models.Koran
import com.example.lesson_2_7.domain.repositories.KoranRepository
import com.example.lesson_2_7.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class KoranRepositoryImpl @Inject constructor(
    private val koranDao: KoranDao
): KoranRepository {
    override fun addKoran(koran: Koran): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = koranDao.addKoran(koran.toKoranEntity())
                emit(Resource.Success(data))
            }catch (e : java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getKoran(): Flow<Resource<List<Koran>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val list = koranDao.getKoran()
                val data = list.map { it.Koran() }
                emit(Resource.Success(data))
            } catch (e: java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage ?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun readerKoran(): Flow<Resource<List<Koran>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val list = koranDao.readerKoran()
                val data = list.map { it.toKoran() }
                emit(Resource.Success(data))
            } catch (e: java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage ?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun durationKoran(): Flow<Resource<List<Koran>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val list = koranDao.durationKoran()
                val data = list.map { it.toKoran() }
                emit(Resource.Success(data))
            } catch (e: java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage ?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun updateKoran(koran: Koran): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = koranDao.updateKoran(koran.toKoranEntity())
                emit(Resource.Success(data))
            }catch (e : java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun deleteKoran(koran: Koran): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = koranDao.deleteKoran(koran.toKoranEntity())
                emit(Resource.Success(data))
            }catch (e : java.lang.Exception) {
                emit(Resource.Error(e.localizedMessage?: "unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }


}