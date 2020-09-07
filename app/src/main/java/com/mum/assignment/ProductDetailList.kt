package com.mum.assignment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_productdetaillist.*

class ProductDetailList : AppCompatActivity(),ItemClick{
    var list= mutableListOf<Product>()
    var adapter = ProductDetialAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productdetaillist)
        val parcelableExtra = intent.getParcelableExtra<Product>("product")
        Log.v("parcelableExtra", parcelableExtra?.name ?: "null")
        if (parcelableExtra != null) {
            tv_title.text =parcelableExtra.name
        }
        for (i in 0..10){
            list.add(Product("it product ${i}",R.mipmap.dd_logo))
        }
        StaggerLayoutManger();
    }

    fun  StaggerLayoutManger(){
        rv_prolist.layoutManager = LinearLayoutManager(this)
        rv_prolist.adapter = adapter
        adapter.setList(list)
        adapter.setOnClick(this)
    }

    override fun onItemClick(product: Product) {
        val intent = Intent(this, ProductDetailActivity::class.java);
        intent.putExtra("product",product)
        startActivity(intent)
    }
}