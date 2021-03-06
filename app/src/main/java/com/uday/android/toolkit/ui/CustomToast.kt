package com.uday.android.toolkit.ui

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.uday.android.toolkit.R

class CustomToast(context: Context) : Toast(context) {
    companion object {

        @SuppressLint("InflateParams")
        fun showSuccessToast(context: Context, message: String, duration: Int) {
            (context as AppCompatActivity).runOnUiThread {
                val toastLayout =
                    context.layoutInflater.inflate(R.layout.toast_custom, null) as LinearLayout
                val text = toastLayout.findViewById(R.id.toast_text) as TextView
                text.text = message
                toastLayout.background = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        context.getDrawable(R.drawable.toast_success)
                }else{
                    @Suppress("DEPRECATION")
                    context.resources.getDrawable(R.drawable.toast_success)
                }
                val toast = Toast(context)
                toast.duration = duration
                toast.view = toastLayout
                toast.show()
            }
        }

        @SuppressLint("InflateParams")
        fun showFailureToast(context: Context, message: String, duration: Int) {
            (context as AppCompatActivity).runOnUiThread {
                val toastLayout =
                    context.layoutInflater.inflate(R.layout.toast_custom, null) as LinearLayout
                val text = toastLayout.findViewById(R.id.toast_text) as TextView
                text.text = message
                toastLayout.background = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        context.getDrawable(R.drawable.toast_failure)
                }else{
                    @Suppress("DEPRECATION")
                    context.resources.getDrawable(R.drawable.toast_failure)
                }
                val toast = Toast(context)
                toast.duration = duration
                toast.view = toastLayout
                toast.show()
            }
        }

        @SuppressLint("InflateParams")
        fun showNotifyToast(context: Context, message: String, duration: Int) {
            (context as AppCompatActivity).runOnUiThread {
                val toastLayout =
                    context.layoutInflater.inflate(R.layout.toast_custom, null) as LinearLayout
                val text = toastLayout.findViewById(R.id.toast_text) as TextView
                text.text = message
                toastLayout.background = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    context.getDrawable(R.drawable.toast_notify)
                }else{
                    @Suppress("DEPRECATION")
                    context.resources.getDrawable(R.drawable.toast_notify)
                }
                val toast = Toast(context)
                toast.duration = duration
                toast.view = toastLayout
                toast.show()
            }
        }
    }
}
