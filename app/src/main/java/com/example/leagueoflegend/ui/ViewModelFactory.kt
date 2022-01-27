package com.example.leagueoflegend.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.leagueoflegend.data.repository.ChampionsRepository

class ViewModelFactory(private val repository: ChampionsRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ChampionsViewModel::class.java)) {
            @Suppress("UNCHECK_CAST")
            return ChampionsViewModel(repository) as T
        }
        throw IllegalArgumentException("asdasd")
    }
}