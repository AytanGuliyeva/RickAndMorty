package com.example.rickandmorty.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.data.repo.Repository
import com.example.rickandmorty.util.Resource
import com.example.rickandmorty.data.retrofit.model.CharacterResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import javax.inject.Inject

@HiltViewModel
class MainViewModel  @Inject constructor(val repo: Repository) :ViewModel(){
    private val _charactersResult = MutableLiveData<Resource<List<CharacterResponse>>>()
    val charactersResult: LiveData<Resource<List<CharacterResponse>>>
        get() = _charactersResult

    private val _loading=MutableLiveData<Boolean>()
    val loading:LiveData<Boolean>
        get() = _loading

    fun getCharacters(){
        _loading.postValue(true)
        viewModelScope.launch(Dispatchers.IO) {
            val response=repo.getCharacters()
        }
    }
}