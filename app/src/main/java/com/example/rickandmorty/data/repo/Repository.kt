package com.example.rickandmorty.data.repo

import com.example.rickandmorty.data.retrofit.CharacterService
import com.example.rickandmorty.data.retrofit.model.CharacterResponse
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(val apiService: CharacterService) {
    suspend fun getCharacters(): Response<CharacterResponse> {
        return apiService.getCharacter()
    }
}