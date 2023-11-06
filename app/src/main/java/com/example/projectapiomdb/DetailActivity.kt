package com.example.projectapiomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.projectapiomdb.databinding.ActivityDetailBinding
import com.example.projectapiomdb.model.MovieDetailData
import retrofit2.Callback

class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding
    var b:Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        b = intent.extras
        val i = b?.getString("imdbid")
        val apikey = "d38cd682"

        RClient.instances.getDetailMovie(i,apikey).enqueue(object : Callback<MovieDetailData>)
    }
}