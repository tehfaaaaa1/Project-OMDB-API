package com.example.projectapiomdb.model

import com.google.gson.annotations.SerializedName

data class SearchData(
    @SerializedName("Search") val data: List<MovieData>,
    @SerializedName("totalResult") val totalData: Int,
    @SerializedName("Response") val res:String
)
