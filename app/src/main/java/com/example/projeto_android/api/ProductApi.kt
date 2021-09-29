package com.example.applicationapi.api

import com.example.projeto_android.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {
    @GET("produtos")
    fun getProductApi(): Call<List<Product>>
}