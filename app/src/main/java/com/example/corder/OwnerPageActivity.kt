package com.example.corder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button

class OwnerPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owner_page)

        val moveBtn1 = findViewById<Button>(R.id.btn1)
        val moveBtn2 = findViewById<Button>(R.id.btn2)
        val moveBtn3 = findViewById<Button>(R.id.btn3)
        val moveBtn4 = findViewById<Button>(R.id.btn4)
        val moveBtn5 = findViewById<Button>(R.id.btn5)

        moveBtn1.setOnClickListener {
            // 자리현황 확인/변경
            startActivity(Intent(this, OwnerCheckSeatActivity::class.java))
        }

        moveBtn2.setOnClickListener {
            // 좌석 배치 변경
            startActivity(Intent(this, OwnerCheckSeatActivity::class.java))
        }

        moveBtn3.setOnClickListener {
            // 가게 주문 확인
            startActivity(Intent(this, OwnerOrderListActivity::class.java))
        }

        moveBtn4.setOnClickListener {
            // 카페 메뉴 등록/변경
            startActivity(Intent(this, OwnerInsertMenuActivity::class.java))
        }
        
        moveBtn5.setOnClickListener {
            // 가게 정보 변경
            startActivity(Intent(this, OwnerCafeInfoActivity::class.java))
        }
    }
}