package com.example.test.Json


import com.google.gson.annotations.SerializedName

data class Recipe(
    @SerializedName("cooking_ingredients")
    val cookingIngredients: List<CookingIngredient?>?,
    @SerializedName("cooking_method")
    val cookingMethod: List<CookingMethod?>?,
    @SerializedName("genre_cd")
    val genreCd: String?,
    @SerializedName("genre_name")
    val genreName: String?,
    @SerializedName("introduction")
    val introduction: String?,
    @SerializedName("main_gazo")
    val mainGazo: String?,
    @SerializedName("recipe_id")
    val recipeId: String?,
    @SerializedName("recipe_name")
    val recipeName: String?,
    @SerializedName("recommended_flg")
    val recommendedFlg: String?
)