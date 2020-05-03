package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Category
import com.example.coderswag.R


class CategoryRecycleAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_row,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position],context)

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val holdCategoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        val holdCategoryText = itemView.findViewById<TextView>(R.id.categoryText)

        fun bindCategory(category: Category, context: Context){
            val resouceID = context.resources.getIdentifier(category.image,"drawable", context.packageName)
            holdCategoryImage?.setImageResource(resouceID)
            holdCategoryText?.text = category.title

        }

    }

}