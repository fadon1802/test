package com.example.test

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivityMainBinding
import android.content.Intent

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY = "key"
    }

    private lateinit var binding: ActivityMainBinding

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("State", "onCreate")
        counter = savedInstanceState?.getInt(KEY) ?: 0
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        val view = binding.root
        setContentView(view)
        binding.counterText.text = counter.toString()
        binding.nextScreenButton.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java).apply {
                putExtra(KEY, counter * counter)})
            }
    }

    override fun onStart() {
        Log.e("MainState", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.e("MainState", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("MainState", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("MainState", "onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        counter++
        outState.putInt(KEY, counter)
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        Log.e("MainState", "onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.e("MainState", "onRestart")
        super.onRestart()
    }
}