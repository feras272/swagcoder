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


//------------------------  RECYCLING THE ITEMS --------------------------------------
    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
        val adapterInflat: View
        val holder: ViewHolder

        if(convertView == null){
            println("This is my first time")
            holder = ViewHolder()

            adapterInflat = LayoutInflater.from(theContext).inflate(R.layout.list_row,null)
            holder.newCategoryImage = adapterInflat.findViewById(R.id.categoryImage)
            holder.newCategoryText = adapterInflat.findViewById(R.id.categoryText)
            adapterInflat.tag = holder

        }else {
            println("Green I'm Recycled")
            holder = convertView.tag as ViewHolder
            adapterInflat = convertView
        }

    //----------  WE CREATE IT ONCE AND WE REUSE IT EVERY TIME IT SHOWS   --------------


        val category = theData[position]

        val resourceId = theContext.resources.getIdentifier(category.image,"drawable",theContext.packageName)

        holder.newCategoryText?.text = category.title
        holder.newCategoryImage?.setImageResource(resourceId)

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

    private class ViewHolder {
        var newCategoryImage: ImageView? = null
        var newCategoryText: TextView? = null
    }
}