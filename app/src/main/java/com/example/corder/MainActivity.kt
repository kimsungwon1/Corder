package com.example.corder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        var list = ArrayList<ListData>()
//        list.add(ListData(ContextCompat.getDrawable(this, R.drawable.coffee)!!, 1, "coffee"))
//
//        val adapter = RecyclerItemAdapter(list)
//        listCafe.adapter = adapter

    }
}