package com.example.leagueoflegend.data.model


data class Champion(
    val version: String,
    val id: String,
    val key: String,
    val name: String,
    val title: String,
    val blurb: String,
    val info: Info,
    val image: ImageX,
    val tags: List<String>,
    val partype: String,
    val stats: Stats,
) {
}