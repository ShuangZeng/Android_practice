package com.mum.assignment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class User( var first_name: String,var  last_name : String ,var email:String,var password : String ) :
    Parcelable