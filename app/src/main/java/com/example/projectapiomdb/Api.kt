package com.example.projectapiomdb

import com.example.projectapiomdb.model.MovieDetailData
import com.example.projectapiomdb.model.SearchData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("/")
    fun getMovies(
        @Query("s") s :String?,
        @Query("apikey") apikey : String
    ): Call<SearchData>
    @GET("/")
    fun getDetailMovie(
        @Query("i") title:String?,
        @Query("apikey") apikey: String
    ): Call<MovieDetailData>
}