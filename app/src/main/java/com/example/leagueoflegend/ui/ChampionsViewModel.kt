package com.example.leagueoflegend.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.leagueoflegend.data.repository.ChampionsRepository
import com.example.leagueoflegend.data.response.ChampionResponse
import kotlinx.coroutines.launch

class ChampionsViewModel(private val championsRepository: ChampionsRepository) : ViewModel() {

    val championList: LiveData<ChampionResponse> = championsRepository.getAllChampions()
}