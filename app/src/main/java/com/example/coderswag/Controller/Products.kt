package com.example.coderswag.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.Adapters.ProductsAdapter
import com.example.coderswag.R
import com.example.coderswag.Servieces.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class Products : AppCompatActivity() {

    lateinit var adater:ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adater = ProductsAdapter(DataService.getProducts(categoryType),this)

        var spanCount = 2
        val orientation = resources.configuration.orientation

        if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this,spanCount)
        productsListID.layoutManager = layoutManager
        productsListID.adapter = adater




    }
}
