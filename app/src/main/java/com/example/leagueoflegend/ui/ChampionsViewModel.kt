package com.example.leagueoflegend.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.leagueoflegend.data.repository.ChampionsRepository
import com.example.leagueoflegend.data.response.ChampionResponse
import kotlinx.coroutines.launch

class ChampionsViewModel(private val championsRepository: ChampionsRepository) : ViewModel() {

    private val mutableChampionList: MutableLiveData<ChampionResponse> = MutableLiveData()
    val championList: LiveData<ChampionResponse>
        get() = mutableChampionList

    fun getAllChampions() {
        viewModelScope.launch {
            mutableChampionList.value = championsRepository.getAllChampions()
        }
    }

}