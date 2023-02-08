package com.ssong_develop.core_data.network.datasource

import com.ssong_develop.core_data.network.service.CharacterServiceApi
import javax.inject.Inject

class CharacterDataSourceNoWrapper @Inject constructor(
    private val service: CharacterServiceApi
) {
    suspend fun getCharacter(id: Int) =
        service.getCharacter(id)

    suspend fun getCharacterEpisode(urls: List<String>) =
        urls.map { url -> service.getCharacterEpisodes(url) }
}