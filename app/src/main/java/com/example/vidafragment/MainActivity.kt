package com.example.vidafragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.vidafragment.Fragments.Fragment2
import com.example.vidafragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e("actividad", "onCreate")

        binding.apply {
            button.setOnClickListener {
                CambiaraFragment2()
            }

        }
    }

    fun CambiaraFragment2() {
        supportFragmentManager.commit {
            replace(R.id.fragmentContainerView, Fragment2())
        }
    }

    fun CambiaraFragment1() {
        supportFragmentManager.commit {
            replace(R.id.fragmentContainerView, Fragment())
        }
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