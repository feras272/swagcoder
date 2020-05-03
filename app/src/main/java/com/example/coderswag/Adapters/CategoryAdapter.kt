package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import org.w3c.dom.Text
import java.util.zip.Inflater

class CategoryAdapter(context: Context, data:List<Category>) : BaseAdapter() {

    val theContext = context
    val theData = data

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val adapterInflat: View
        adapterInflat = LayoutInflater.from(theContext).inflate(R.layout.list_row,null)
        val theCategoryImage: ImageView = adapterInflat.findViewById(R.id.categoryImage)
        val theCategoryText: TextView = adapterInflat.findViewById(R.id.categoryText)
        val category = theData[position]

        val resourceId = theContext.resources.getIdentifier(category.image,"drawable",theContext.packageName)

        theCategoryText.text = category.title
        theCategoryImage.setImageResource(resourceId)

        return adapterInflat
    }

    override fun getItem(p0: Int): Any {
        return theData[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return theData.count()
    }
}