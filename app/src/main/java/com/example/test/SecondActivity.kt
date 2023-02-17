package com.example.test
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.test.databinding.ActivityTwoBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTwoBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("SecondState", "onCreate")
        counter = intent?.getIntExtra(MainActivity.KEY, 0) ?: counter
        counter = savedInstanceState?.getInt(MainActivity.KEY) ?: counter
        binding = ActivityTwoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.counterPowText.text = counter.toString()
        super.onCreate(savedInstanceState)
        }

    override fun onRestart() {
        Log.e("SecondState", "onRestart")
        super.onRestart()
    }

    override fun onStart() {
        Log.e("SecondState", "onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.e("SecondState", "onPause")
        super.onPause()
    }

    override fun onResume() {
        Log.e("SecondState", "onResume")
        super.onResume()
    }

    override fun onStop() {
        Log.e("SecondState", "onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(MainActivity.KEY, counter)
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        Log.e("SecondState", "onDestroy")
        super.onDestroy()
    }
}