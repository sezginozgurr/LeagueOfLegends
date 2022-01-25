package com.example.leagueoflegend.data.repository

import androidx.lifecycle.LiveData
import com.example.leagueoflegend.data.api.ChampionAPI
import com.example.leagueoflegend.data.response.ChampionResponse
import retrofit2.Response

class ChampionsRepository(private val championAPI: ChampionAPI) {

    fun getAllChampions(): LiveData<ChampionResponse> = championAPI.getAllChampions()
}