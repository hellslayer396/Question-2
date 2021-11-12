package com.example.question2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.question2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioButtonOne.setOnClickListener {
            Toast.makeText(this,"You Clicked On Radio Button One",Toast.LENGTH_SHORT).show()
        }

        binding.radioButtonTwo.setOnClickListener {
            Toast.makeText(this,"You Clicked On Radio Button Two",Toast.LENGTH_SHORT).show()
        }

        binding.radioButtonThree.setOnClickListener {
            Toast.makeText(this,"You Clicked On Radio Button Three",Toast.LENGTH_SHORT).show()
        }

        binding.button.setOnClickListener {
            var display = binding.editText.text
            Toast.makeText(this,"You Entered $display",Toast.LENGTH_SHORT).show()
        }

        binding.checkbox.setOnClickListener {
            if (binding.checkbox.isChecked)
            { Toast.makeText(this,"You Checked ${binding.checkbox.text}",Toast.LENGTH_SHORT).show()}
            else
            {Toast.makeText(this,"You Unchecked ${binding.checkbox.text}",Toast.LENGTH_SHORT).show()}
        }
    }
}