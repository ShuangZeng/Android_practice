package com.mum.assignment


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var foodList = mutableSetOf("Hamburger","Pizza","American","Mexican","Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDecide.setOnClickListener {
            msg.text = foodList.random()
        }

        btnAddFood.setOnClickListener {
            txtNewFood.text?.let {
                foodList.add(it.toString())
            }
        }
  }
}
