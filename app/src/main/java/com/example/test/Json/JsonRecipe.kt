package com.example.test.Json


import com.google.gson.annotations.SerializedName

data class JsonRecipe(
    @SerializedName("genre")
    val genre: List<Genre?>?,
    @SerializedName("recipe")
    val recipe: List<Recipe?>?
)