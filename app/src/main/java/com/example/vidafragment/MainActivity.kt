package com.example.vidafragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("actividad", "onCreate")
    }

    override fun onStart() {
        Log.e("actividad", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.e("actividad", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("actividad", "onPause")
        super.onPause()
    }

    override fun onRestart() {
        Log.e("actividad", "onRestart")
        super.onRestart()
    }

    override fun onStop() {
        Log.e("actividad", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e("actividad", "onDestroy")
        super.onDestroy()
    }
}