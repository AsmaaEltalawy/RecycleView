package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter (val users :List<User>)
    : RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    class MyViewHolder(val row : View): RecyclerView.ViewHolder(row) {
        val tv_name = row.findViewById<TextView>(R.id.user_name)
        val tv_email = row.findViewById<TextView>(R.id.user_email)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
    return MyViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return users.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val user = users.get(position)
        holder.tv_name.text = user.name
        holder.tv_email.text = user.email
    }
}