package com.example.rickandmorty.data.retrofit

import com.example.rickandmorty.data.retrofit.model.CharacterResponse
import retrofit2.http.GET

interface CharacterService {
    @GET("/character")
    suspend fun getCharacter():retrofit2.Response<CharacterResponse>
}