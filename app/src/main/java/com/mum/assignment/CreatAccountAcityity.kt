package com.mum.assignment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.acticity_creat.*


class CreatAccountAcityity  : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acticity_creat)
    }

    fun CreatAccount(view: View){
        if ( ed_firstname.text.toString().isEmpty()){
            Toast.makeText(this,"first name is request",Toast.LENGTH_SHORT).show()
            return
        }
        if ( ed_lastname.text.toString().isEmpty()){
            Toast.makeText(this,"last name is request",Toast.LENGTH_SHORT).show()
            return
        }
        if ( et_username.text.toString().isEmpty()){
            Toast.makeText(this,"email is request",Toast.LENGTH_SHORT).show()
            return
        }
        if ( et_password.text.toString().isEmpty()){
            Toast.makeText(this,"password name is request",Toast.LENGTH_SHORT).show()
            return
        }
        var intent = Intent().putExtra("user",User( ed_firstname.text.toString()
            ,ed_lastname.text.toString()
            ,et_username.text.toString()
            , et_password.text.toString()))
        setResult(1,intent)
        finish()

    }
}