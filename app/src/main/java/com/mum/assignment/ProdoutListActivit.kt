package com.mum.assignment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_productlist.*

class ProdoutListActivit : AppCompatActivity(),ItemClick{

    var list= mutableListOf<Product>()
    var adapter = MyAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productlist)
        for (i in 0..3){
            list.add(Product("is number ${i} product", R.mipmap.dd_logo))
        }

        testWithStaggerLayoutManger();
    }

    fun  testWithStaggerLayoutManger(){
        rv_prolist.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        rv_prolist.adapter = adapter
        adapter.setList(list)
        adapter.setOnClick(this)
    }

    override fun onItemClick(product: Product) {
        val intent = Intent(this, ProductDetailList::class.java);
        intent.putExtra("product",product)
        startActivity(intent)
    }


}
