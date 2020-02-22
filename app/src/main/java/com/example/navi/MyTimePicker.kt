package com.example.navi

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment

class MyTimePicker: DialogFragment(), TimePickerDialog.OnTimeSetListener {
    // kỹ thuật giao tiếp ngược , callback or delegate
    interface onSetTime {
        fun onTimeSet(hourOfDay: Int, minute: Int) // muốn data nào thì khai báo ở tham số
    }

    var listener: onSetTime? = null // tham chiếu tới thằng kế

    fun setListener2(listener: onSetTime) {
        this.listener = listener
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) { // nhan data tu dialog
        listener?.onTimeSet(hourOfDay,minute) // truyen  nguoc ra
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        return TimePickerDialog( activity,
            this,
            hour,
            minute,
            true)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        setListener2(context as onSetTime) // khai bao activity chua frag se nhan du lieu nguoc
    }
}