package com.example.rickandmorty.data.retrofit.model

import com.example.rickandmorty.data.retrofit.model.Location
import com.example.rickandmorty.data.retrofit.model.Origin

data class CharacterResponse(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)