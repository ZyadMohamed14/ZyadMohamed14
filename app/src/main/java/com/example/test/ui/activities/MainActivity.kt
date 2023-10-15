package com.example.test.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.example.test.R
import com.example.test.ui.viewmodel.MainViewModel


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        private val mainViewModel: MainViewModel by viewModels()
        val phone_type=findViewById<TextView>(R.id.resulttext)
        // Observe the view model's phone type property for changes
        mainViewModel.phoneType.observe(this) { phoneType ->
            // Update the UI with the new phone type
            phone_type.text = phoneType.toString()
        }



    }


    }
