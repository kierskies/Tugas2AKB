/*
NAMA    : ANGGA PUJA RESTU PRAKASA
NIM     : 10117130
KELAS   : IF4

TANGGAL PENGERJAAN : 16 - APRIL - 2020
 */

package com.aprp.tugas2akb

import android.app.Activity
import android.content.SharedPreferences

object Utils {
    var sharedPreferences : SharedPreferences? = null

    const val UsrName = "UsrName"
    const val BloodType = "BloodType"

    fun makeSharedPref(activity: Activity){
        sharedPreferences = activity.getSharedPreferences("USER_PREF", 0)
    }
    fun putSharedPref(key: String,data: String){
        val editor = sharedPreferences!!.edit()
        editor.putString(key,data)
        editor.apply()
    }

    fun putSharedPref(key: String,data: Int){
        val editor = sharedPreferences!!.edit()
        editor.putInt(key, data)
        editor.apply()
    }

    fun getStringSharedPref(key: String) : String{
        return sharedPreferences!!.getString(key,"")!!
    }
    fun getIntSharedPref(key: String) : Int{
        return sharedPreferences!!.getInt(key,0)
    }
}