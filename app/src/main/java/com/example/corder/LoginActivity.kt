package com.example.corder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val goJoinbtn = findViewById<Button>(R.id.goJoin)

        goJoinbtn.setOnClickListener {
            // 자리현황 확인/변경
            startActivity(Intent(this, JoinActivity::class.java))
        }

    }
}