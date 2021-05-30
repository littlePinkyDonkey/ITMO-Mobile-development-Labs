package com.example.lab4.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab4.R
import com.example.lab4.models.ANDROID_VERSIONS
import com.example.lab4.views.AndroidAdapter
import kotlinx.android.synthetic.main.recycler_activity.*

class RecyclerActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_activity)
        androidsList.apply {
            layoutManager = LinearLayoutManager(this@RecyclerActivity)
            adapter = AndroidAdapter(ANDROID_VERSIONS)
            addItemDecoration(
                DividerItemDecoration(this@RecyclerActivity, DividerItemDecoration.HORIZONTAL).apply {
                    setDrawable(ContextCompat.getDrawable(this@RecyclerActivity, R.color.colorAccent)!!)
                })
        }
    }
}