package com.example.projeto_android.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_android.R
import com.example.projeto_android.model.Product

class ProductAdapter(private val context: Context,
                     private val productList: List<Product>): RecyclerView.Adapter<ProductViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder =
        ProductViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false))

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item = productList[position]
        holder.productName.text = item.nome
        holder.productPrice.text = item.categoria
    }

    override fun getItemCount(): Int = productList.size

}

class ProductViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
    val productName: TextView = itemView.findViewById(R.id.product_name)
    val productPrice: TextView = itemView.findViewById(R.id.product_price)


}