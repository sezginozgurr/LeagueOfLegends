package com.example.leagueoflegend.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.leagueoflegend.R
import com.example.leagueoflegend.data.api.ChampionAPI
import com.example.leagueoflegend.data.remote.RetrofitClient
import com.example.leagueoflegend.data.response.ChampionResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit: Retrofit = RetrofitClient.getInstance()
        val championApi: ChampionAPI = retrofit.create(ChampionAPI::class.java)

        val getAllChampions = championApi.getAllChampions()

        val callback = object : Callback<ChampionResponse> {
            override fun onResponse(
                call: Call<ChampionResponse>,
                response: Response<ChampionResponse>
            ) {
                 show(response.body()?.data?.Aatrox!!.name)
            }

            override fun onFailure(call: Call<ChampionResponse>, t: Throwable) {
                Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT).show()
            }
        }

        getAllChampions.enqueue(callback)
    }

    fun show(name: String) {
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }

}