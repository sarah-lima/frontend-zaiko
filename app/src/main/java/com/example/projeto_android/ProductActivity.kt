package com.example.projeto_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationapi.api.MyRetrofit
import com.example.projeto_android.adapter.ProductAdapter
import com.example.projeto_android.model.Product
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductActivity : AppCompatActivity() {

    lateinit var recycleProducts: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        recycleProducts = findViewById(R.id.recycler_products)
        recycleProducts.layoutManager = LinearLayoutManager(this)
        getData()
    }

    private fun getData() {
        val call: Call<List<Product>> =
            MyRetrofit.instance?.productApi()?.getProductApi() as Call<List<Product>>
        call.enqueue(object : Callback<List<Product>> {
            override fun onResponse(call: Call<List<Product>>, response: Response<List<Product>>) {
                val adapter =
                    ProductAdapter(this@ProductActivity, response.body()?.toList() as List<Product>)
                recycleProducts.adapter = adapter
            }

            override fun onFailure(call: Call<List<Product>>, t: Throwable) {
                Toast.makeText(this@ProductActivity, t.message, Toast.LENGTH_LONG).show()
            }

        })

    }
}