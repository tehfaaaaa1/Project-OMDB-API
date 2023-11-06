package com.example.projectapiomdb

import com.example.projectapiomdb.model.SearchData
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("?s=genshin&apikey=d38cd682")
    fun getMovies(): Call<SearchData>
}