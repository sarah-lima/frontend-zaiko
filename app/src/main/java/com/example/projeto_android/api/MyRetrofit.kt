package com.example.applicationapi.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyRetrofit {
    private val retrofit: Retrofit
    fun productApi(): ProductApi{
        return retrofit.create(ProductApi::class.java)
    }
    companion object{
        private const val BASE_URL =
//            "http://54.205.171.136:8080"
                "http://10.6.1.59:8080/"
        var myRetrofit: MyRetrofit?= null

        @get:Synchronized
        val instance: MyRetrofit?
            get(){
                if(myRetrofit == null){
                    myRetrofit = MyRetrofit()
                }
                return myRetrofit
            }
    }
    init {
        retrofit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}