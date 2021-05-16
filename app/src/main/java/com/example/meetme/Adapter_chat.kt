package com.example.meetme

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter_chat(private val context: Context, private val exampleList: List<Personne_chat>) : RecyclerView.Adapter<Adapter_chat.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_chat,
            parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = exampleList[position]

        holder.imageView.setImageResource(currentItem.images)
        holder.textView1.text = currentItem.name
        holder.textView2.text = currentItem.message

        //holder.layout121.setOnClickListener {
            //val intent = Intent(context,MainActivity_121::class.java)
            //intent.putExtra("userId",Personne_chat.userId)
            //intent.putExtra("userName",Personne_chat.userName)
            //context.startActivity(intent)
        //}
    }

    override fun getItemCount() = exampleList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view_1)
        val textView1: TextView = itemView.findViewById(R.id.text_view_1)
        val textView2: TextView = itemView.findViewById(R.id.text_view_1_1)
    }
}