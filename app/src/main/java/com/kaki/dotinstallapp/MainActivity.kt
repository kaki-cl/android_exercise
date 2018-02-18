package com.kaki.dotinstallapp

import android.app.LauncherActivity
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListView: ListView = findViewById(R.id.myListView)
        val animals = listOf("Rabbit", "Dog", "Cat", "Turtle", "Bear", "Dolphin", "Lion", "Tiger", "Dog", "Cat", "Turtle", "Bear", "Dolphin", "Lion", "Tiger", "Dog", "Cat", "Turtle", "Bear", "Dolphin", "Lion", "Tiger")
        val adapter = ArrayAdapter<String>(this, R.layout.list_item, animals)
        myListView.adapter = adapter

        /*
        val animals = listOf("Rabbit", "Dog", "Cat", "Turtle", "Bear", "Dolphin", "Lion", "Tiger")
        val adapter = ArrayAdapter<String>(this, R.layout.list_item, animals)
        simpleListView.adapter = adapter as ListAdapter
         */


//        // データを準備
//        var listItemsArray = arrayOfNulls<String>(30)
//        for (i in 0..29 ) listItemsArray[i] = "item : " + i
//
//        // adapter作成
//        val listItemAdapter = ListItemAdapter(applicationContext)
//        listItemAdapter.listItems = listItemsArray
//
//        // listViewを定義 adapterをセット
//        val myListView: ListView = findViewById(R.id.myListView)
//        myListView.adapter = listItemAdapter
    }
}
