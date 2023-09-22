package com.example.test.Json


import com.google.gson.annotations.SerializedName

data class Genre(
    @SerializedName("genre_cd")
    val genreCd: String?,
    @SerializedName("genre_ic_url")
    val genreIcUrl: String?,
    @SerializedName("genre_name")
    val genreName: String?
)