package com.example.midterm_dorian_loris

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class RVAdapter(private val dataList: List<RVDataAPIItem>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.tvID.text = "ID: " + item.id.toString()
        holder.tvUSERID.text = "UserID: " + item.userId.toString()
        holder.tvTITLE.text = "Title: " + item.title.toString()
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvID: TextView = itemView.findViewById(R.id.tvid)
        val tvUSERID: TextView = itemView.findViewById(R.id.tvuserid)
        val tvTITLE: TextView = itemView.findViewById(R.id.tvtitle)

        init {
            itemView.setOnClickListener {
                val intent = Intent(itemView.context , RemoveItemActivity::class.java)
            //    intent.putExtra("ID", tvID)
            //    intent.putExtra("userID", tvUSERID)
            //    intent.putExtra("Title", tvTITLE)
                itemView.context.startActivity(intent)
            }
        }
    }
}