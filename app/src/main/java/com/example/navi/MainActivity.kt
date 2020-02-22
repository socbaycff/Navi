package com.example.navi

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker

class MainActivity : AppCompatActivity(), MyTimePicker.onSetTime {
    override fun onTimeSet(hourOfDay: Int, minute: Int) { // giao tiep frag
     //   hourOfDay, mi
    }

    //

    val bien1: Int = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     //   val timePicker = MyTimePicker()
    //    timePicker.setListener2(this) // set nguoi se giao tiep fragment
      //  timePicker.show(supportFragmentManager,"d")

    }



}
