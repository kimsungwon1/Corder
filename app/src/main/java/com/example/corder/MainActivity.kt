package com.example.corder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goLoginbtn = findViewById<Button>(R.id.goLogin)

        goLoginbtn.setOnClickListener {
            // 자리현황 확인/변경
            startActivity(Intent(this, LoginActivity::class.java))
        }

//        var list = ArrayList<ListData>()
//        list.add(ListData(ContextCompat.getDrawable(this, R.drawable.coffee)!!, 1, "coffee"))
//
//        val adapter = RecyclerItemAdapter(list)
//        listCafe.adapter = adapter

    }
}