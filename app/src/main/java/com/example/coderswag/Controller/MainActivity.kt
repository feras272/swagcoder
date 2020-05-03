package com.example.coderswag.Controller

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Servieces.DataService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_row.*
import kotlinx.android.synthetic.main.list_row.view.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter:ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,DataService.catogaries)
        categoryList.adapter = adapter

//        val myArray = listOf<String>("Feras","Eyad","Fares","Lama","Abdullah","Abdulaziz","Ghassan")
//        val myAdabter = ArrayAdapter(this,android.R.layout.simple_list_item_1,myArray)
//
//        myList.adapter = myCustomAdapter(this)


    }
}

//private class myCustomAdapter(context:Context) : BaseAdapter(){
//
//    var myContext = context
//
//    init {
//        this.myContext = context
//    }
//
//    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
//        var myLayoutInflate = LayoutInflater.from(myContext).inflate(R.layout.list_row,p2,false)
//        myLayoutInflate.myName.text = "Feras"
//        myLayoutInflate.myAge.text = "19y"
//        myLayoutInflate.myImage.setImageDrawable(R.drawable.ic_launcher_background)
//        return myLayoutInflate
//
//    }
//
//    override fun getItem(p0: Int): Any {
//        return ""
//    }
//
//    override fun getItemId(p0: Int): Long {
//        return p0.toLong()
//    }
//
//    override fun getCount(): Int {
//        return 10
//
//    }
//
//}
//
//private fun ImageView.setImageDrawable(ic_launcher_background: Int) {
//
//}
