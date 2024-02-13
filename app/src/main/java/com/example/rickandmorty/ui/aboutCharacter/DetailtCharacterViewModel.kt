package com.example.rickandmorty.ui.aboutCharacter

import androidx.lifecycle.ViewModel
import com.example.rickandmorty.data.repo.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailtCharacterViewModel @Inject constructor(val repo:Repository) : ViewModel(){
}