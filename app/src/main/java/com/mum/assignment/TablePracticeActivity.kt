package com.mum.assignment

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.item_layout.view.*
import kotlinx.android.synthetic.main.tablayoutpractice.*

class TablePracticeActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablayoutpractice)

        btnAddVC.setOnClickListener {

            var version = txtVersion.text.toString()
            var codeName = txtCodeName.text.toString()

            var layout = LayoutInflater.from(this).inflate(R.layout.item_layout, null)
            layout.textView_version.text = version
            layout.textView_name.text = codeName

            tablePractice.addView(layout)

        }
    }
}