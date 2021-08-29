package com.example.instagram_clone.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram_clone.Models.Rasm
import com.example.instagram_clone.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_rv_2.view.*
import kotlinx.android.synthetic.main.rv_item_image.view.*

class RasmAdapter2(val rasmList:List<Rasm>) : RecyclerView.Adapter<RasmAdapter2.MyViewHolder>(){

    inner class MyViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(rasm: Rasm, position: Int) {

            Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(itemView.image_rv_2);

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_2, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(rasmList[position], position)
    }

    override fun getItemCount(): Int = rasmList.size
}