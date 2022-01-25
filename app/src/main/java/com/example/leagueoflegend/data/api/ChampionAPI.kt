package com.example.leagueoflegend.data.api

import androidx.lifecycle.LiveData
import com.example.leagueoflegend.data.response.ChampionByIdResponse
import com.example.leagueoflegend.data.response.ChampionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ChampionAPI {
    @GET("cdn/{apiVersion}/data/{language}/champion.json")
    fun getAllChampions(
        @Path("apiVersion") apiVersion: String = "12.2.1",
        @Path("language") language: String = "en_US"
    ): LiveData<ChampionResponse>

    @GET("cdn/{apiVersion}/data/{language}/{championId}.json")
    suspend fun getChampionsById(
        @Path("apiVersion") apiVersion: String = "12.2.1",
        @Path("language") language: String = "en_US",
        @Path("championId") championId: String = "Aatrox"
    ): LiveData<ChampionByIdResponse>
}