package com.mum.assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter  : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    private var list: MutableList<Product>? = null
    private var itemClick:ItemClick? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        val holder = MyViewHolder(itemView)
        return holder
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder?.text?.text = list!![position].name
        holder.itemView.setOnClickListener(View.OnClickListener {
            itemClick!!.onItemClick(list!![position])
        })
    }

    open fun setList( list : MutableList<Product>){
        this.list = list
        notifyDataSetChanged()
    }

    open fun setOnClick(itemClick : ItemClick){
        this.itemClick = itemClick
    }

    class MyViewHolder(itmeview : View) : RecyclerView.ViewHolder(itmeview) {
        var text: TextView = itemView!!.findViewById(R.id.item_text)
        var imageView: ImageView = itemView!!.findViewById(R.id.image_pro)

    }




}