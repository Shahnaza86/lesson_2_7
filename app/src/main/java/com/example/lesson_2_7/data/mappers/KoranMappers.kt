package com.example.lesson_2_7.data.mappers

import com.example.lesson_2_7.data.models.KoranEntity
import com.example.lesson_2_7.domain.models.Koran


fun KoranEntity.toKoran() = Koran(id, name, reader, sura, duration)

fun List<KoranEntity>.toKoranList() = map {
    Koran(
        id = it.id,
        name = it.name,
       reader = it.reader,
        sura = it.sura,
        duration = it.duration
    )
}