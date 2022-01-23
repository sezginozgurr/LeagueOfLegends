package com.example.leagueoflegend.data.response

import com.example.leagueoflegend.data.model.ChampionList

data class ChampionResponse(
    val type: String,
    val format: String,
    val version: String,
    val data: ChampionList
)
