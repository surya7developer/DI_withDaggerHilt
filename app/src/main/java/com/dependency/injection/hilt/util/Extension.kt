package com.dependency.injection.hilt.util

import android.content.Context
import android.util.Log
import android.widget.Toast

const val TAG = "MainActivity"

fun Context.showLog(tag:String="MainActivity",msg:String="Log Printed"){
    Log.d(tag,msg)
}

fun Context.showToast(msg:String){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}