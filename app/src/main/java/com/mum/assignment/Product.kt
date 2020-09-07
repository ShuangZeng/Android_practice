package com.mum.assignment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(var name :String , var url : Int): Parcelable{}