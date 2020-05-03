package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Product
import com.example.coderswag.R

class ProductsAdapter(val product:List<Product>, val context:Context):RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return product.size
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(product[position],context)
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val productImage = itemView.findViewById<ImageView>(R.id.iv_product)
        val productPrice = itemView.findViewById<TextView>(R.id.price_product)
        val productText = itemView.findViewById<TextView>(R.id.tx_product)

        fun bindProduct (product:Product,context: Context){
            val resourceId = context.resources.getIdentifier(product.image,"drawable",context.packageName)
            productImage.setImageResource(resourceId)
            productText.text = product.title
            productPrice.text = product.price
        }
    }


}