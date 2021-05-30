package com.example.lab4.views

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab4.R
import kotlinx.android.synthetic.main.android_list_item.view.*
import com.example.lab4.controller.DetailsActivity
import com.example.lab4.models.Android

class AndroidAdapter(private val versions: List<Android>): RecyclerView.Adapter<AndroidAdapter.AndroidHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        AndroidHolder(LayoutInflater.from(parent.context).inflate(R.layout.android_list_item, parent, false))

    override fun getItemCount() = versions.size

    override fun onBindViewHolder(holder: AndroidHolder, position: Int) = holder.bind(versions[position])

    inner class AndroidHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(elem: Android) {
            with(itemView) {
                logoView.setImageResource(elem.logo)
                versionTv.text = elem.title
                setOnClickListener {
                    context.startActivity(
                        Intent(context, DetailsActivity::class.java).apply { putExtra(elem::class.java.canonicalName, elem) }
                    )
                }
            }
        }
    }
}