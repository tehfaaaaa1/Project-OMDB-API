package com.example.projectapiomdb.model

import com.google.gson.annotations.SerializedName

data class MovieData(
    val Title:String,
    val Year:String,
    @SerializedName("Poster") val Image: String
)
