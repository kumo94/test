package com.example.test.Json


import com.google.gson.annotations.SerializedName

data class CookingMethod(
    @SerializedName("procedure")
    val procedure: String?,
    @SerializedName("procedure_no")
    val procedureNo: String?
)