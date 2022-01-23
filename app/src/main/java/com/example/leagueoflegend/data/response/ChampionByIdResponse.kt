package com.example.leagueoflegend.data.response

import com.example.leagueoflegend.data.model.detail.ChampionDetail

data class ChampionByIdResponse(
    val type: String,
    val format: String,
    val version: String,
    val data: ChampionDetail
)
