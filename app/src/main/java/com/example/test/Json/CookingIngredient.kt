package com.example.test.Json


import com.google.gson.annotations.SerializedName

data class CookingIngredient(
    @SerializedName("material")
    val material: String?,
    @SerializedName("quantity")
    val quantity: String?
)