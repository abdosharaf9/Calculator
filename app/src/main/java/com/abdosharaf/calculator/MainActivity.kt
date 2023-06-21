package com.abdosharaf.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.abdosharaf.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val buttons = listOf(R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4,
        R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initMainClicks()
    }

    private fun changeText(char: String) {
        val old = binding.tvEquation.text
        binding.tvEquation.text = "$old$char"
    }

    private fun initMainClicks() {
        binding.button0.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.button1.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.button2.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.button3.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.button4.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.button5.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.button6.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.button7.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.button8.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.button9.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.buttonDot.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.buttonAdd.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.buttonSubtract.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.buttonMultiply.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.buttonDivide.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.buttonOpenBracket.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.buttonCloseBracket.setOnClickListener { changeText((it as Button).text.toString()) }
        binding.buttonC.setOnClickListener { binding.tvEquation.text = "" }
    }
}