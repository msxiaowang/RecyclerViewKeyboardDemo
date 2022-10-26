package com.example.recyclver_keyboard_issue_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview).apply {
            adapter = CustomAdapter()
        }

        findViewById<View>(R.id.button).run {
            setOnClickListener { recyclerView.getChildAt(0).requestLayout() }
        }
    }
}