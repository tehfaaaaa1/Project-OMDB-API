package com.example.projectapiomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.bumptech.glide.Glide
import com.example.projectapiomdb.databinding.ActivityDetailBinding
import com.example.projectapiomdb.model.MovieDetailData
import retrofit2.Callback
import retrofit2.Call
import retrofit2.Response

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    var b: Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        b = intent.extras
        val i = b?.getString("imdbid")
        val apikey = "d38cd682"

        RClient.instances.getDetailMovie(i, apikey).enqueue(object : Callback<MovieDetailData> {
            override fun onResponse(
                call: Call<MovieDetailData>,
                response: Response<MovieDetailData>
            ) {
                binding.tvTahun.text = response.body()?.Year
                binding.tvJudulMovie.text = response.body()?.Title
                binding.tvRilis.text = response.body()?.Rilis

                Glide.with(this@DetailActivity).load(response.body()?.Image).into(binding.imgGambarPoster)
            }

            override fun onFailure(call: Call<MovieDetailData>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}