package com.example.leagueoflegend.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.leagueoflegend.R
import com.example.leagueoflegend.data.api.ChampionAPI
import com.example.leagueoflegend.data.remote.RetrofitClient
import com.example.leagueoflegend.data.repository.ChampionsRepository
import com.example.leagueoflegend.data.response.ChampionResponse
import retrofit2.Retrofit

class ChampionsFragment : Fragment(R.layout.fragment_champions) {

    private val retrofit: Retrofit by lazy {
        RetrofitClient.getInstance()
    }
    private val championApi: ChampionAPI by lazy {
        retrofit.create(ChampionAPI::class.java)
    }
    private val repository: ChampionsRepository = ChampionsRepository(championApi)
    val championsViewModel: ChampionsViewModel by viewModels<ChampionsViewModel> {
        ViewModelFactory(repository)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        championsViewModel.championList.observe(this, ::championListObserver)

        championsViewModel.getAllChampions()
    }

    private fun championListObserver(response: ChampionResponse) {
        Toast.makeText(requireContext(), response.data.Aatrox.name, Toast.LENGTH_SHORT).show()
    }

}