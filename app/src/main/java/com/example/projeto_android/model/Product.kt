package com.example.projeto_android.model

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("id")
    val id:Integer,
    @SerializedName("nome")
    val nome:String,
    @SerializedName("categoria")
    val categoria:String,
)