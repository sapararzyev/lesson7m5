package com.example.lesson7m5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson7m5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pilusCase()
        minusCase()
        divCase()
        mulCase()
    }

    @SuppressLint("SetTextI18n")
    fun pilusCase() = with(binding) {
        btnPilus.setOnClickListener {
            val num1 = num1.text.toString()
            val num2 = num2.text.toString()
            tvResult.text = (num1.toInt() + num2.toInt()).toString()
        }
    }

     fun minusCase() = with(binding) {
         btnMinus.setOnClickListener {
        val num1 = num1.text.toString()
        val num2 = num2.text.toString()
        tvResult.text = (num1.toInt() - num2.toInt()).toString()
    }}


    @SuppressLint("SetTextI18n")
    fun divCase() = with(binding) {
        btn3.setOnClickListener {
            val num1 = num1.text.toString()
            val num2 = num2.text.toString()
            tvResult.text = (num1.toInt() / num2.toInt()).toString()
        }
    }

    @SuppressLint("SetTextI18n")
    fun mulCase() = with(binding) {
        btn4.setOnClickListener {
            val num1 = num1.text.toString()
            val num2 = num2.text.toString()
            tvResult.text = (num1.toInt() * num2.toInt()).toString()
        }
    }
}
