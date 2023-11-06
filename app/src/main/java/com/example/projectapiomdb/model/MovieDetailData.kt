package com.example.projectapiomdb.model

import com.google.gson.annotations.SerializedName

data class MovieDetailData(
    val Year: String,
    val Title: String,
    @SerializedName("Released") val Rilis:String,
    @SerializedName("Poster") val Image:String
)
