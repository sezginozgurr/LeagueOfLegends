package com.example.leagueoflegend.data.model.detail

import com.example.leagueoflegend.data.model.ImageX
import com.example.leagueoflegend.data.model.Info
import com.example.leagueoflegend.data.model.Stats

data class ChampionDetail(
    val id: String,
    val key: String,
    val name: String,
    val title: String,
    val image: ImageX,
    val skins: List<Skin>,
    val lore: String,
    val blurb: String,
    val allytips: List<String>,
    val enemytips: List<String>,
    val tags: List<String>,
    val partype: String,
    val info: Info,
    val stats: Stats,
    //val spells: List<dsfsdf>,
    val passive: Passive,
    //val recommended: List<asdsd>
)
