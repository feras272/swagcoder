package com.example.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Adapters.CategoryAdapter
import com.example.coderswag.Adapters.CategoryRecycleAdapter
import com.example.coderswag.R
import com.example.coderswag.Servieces.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.catogaries) {category ->
            //Toast.makeText(this,"you Clicked the ${category.title} title",Toast.LENGTH_SHORT).show()
            val productsIntent = Intent(this,Products::class.java)
            productsIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productsIntent)

        }
        categoryListID.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListID.layoutManager = layoutManager
        categoryListID.setHasFixedSize(true)


//        = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.catogaries)
//        categoryListID.adapter = adapter
//
//        categoryListID.setOnItemClickListener { adapterView, view, i, l ->
//            val simpleCategory = DataService.catogaries[i]
//            Toast.makeText(this,"You clicked on the ${simpleCategory.title} item",Toast.LENGTH_SHORT).show()
//        }

    }
}
