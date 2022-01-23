package com.example.leagueoflegend.data.api

import com.example.leagueoflegend.data.response.ChampionByIdResponse
import com.example.leagueoflegend.data.response.ChampionResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ChampionAPI {
    @GET("cdn/{apiVersion}/data/{language}/champion.json")
    fun getAllChampions(
        @Path("apiVersion") apiVersion: String = "12.2.1",
        @Path("language") language: String = "en_US"
    ): Call<ChampionResponse>

    @GET("cdn/{apiVersion}/data/{language}/{championId}.json")
    fun getChampionsById(
        @Path("apiVersion") apiVersion: String = "12.2.1",
        @Path("language") language: String = "en_US",
        @Path("championId") championId: String = "Aatrox"
    ): Call<ChampionByIdResponse>
}