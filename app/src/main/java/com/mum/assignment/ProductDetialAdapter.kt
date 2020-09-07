package com.mum.assignment

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductDetialAdapter() : RecyclerView.Adapter<ProductDetialAdapter.MyViewHoleder>(){

    private var list: MutableList<Product>? = null
    private var itemClick:ItemClick? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHoleder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_productdetail, parent, false)
        val holder = ProductDetialAdapter.MyViewHoleder(itemView)
        return holder
    }

    override fun getItemCount(): Int {
        return  list?.size?:0
    }

    override fun onBindViewHolder(holder: MyViewHoleder, position: Int) {
        holder?.title?.text = list!![position].name
        holder?.imageView.setImageResource(R.mipmap.dd_logo)
        holder.itemView.setOnClickListener(View.OnClickListener {
            itemClick!!.onItemClick(list!![position])
        })
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
    open fun setList( list : MutableList<Product>){
        this.list = list
        notifyDataSetChanged()
    }
    open fun setOnClick(itemClick : ItemClick){
        this.itemClick = itemClick
    }

    class MyViewHoleder(itemview: View) :RecyclerView.ViewHolder(itemview){
        var title: TextView = itemView!!.findViewById(R.id.tv_title)
        var detailList: TextView = itemView!!.findViewById(R.id.tv_detail)
        var imageView: ImageView = itemView!!.findViewById(R.id.iv_title)
    }
}