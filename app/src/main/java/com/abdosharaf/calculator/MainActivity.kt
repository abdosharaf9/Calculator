package com.abdosharaf.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.abdosharaf.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var expression: Expression
    private var clearEquation = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClearClicked(view: View) {
        binding.tvEquation.text = ""
        binding.tvResult.text = ""
    }

    fun onDeleteClicked(view: View) {
        binding.tvEquation.text = binding.tvEquation.text.dropLast(1)
    }

    fun onButtonClicked(view: View) {
        if (clearEquation) {
            onClearClicked(view)
            clearEquation = false
        }

        if((view as Button).text == "x") {
            binding.tvEquation.append("*")
        } else {
            binding.tvEquation.append(view.text)
        }
    }

    fun onEqualClicked(view: View) {
        val equation = binding.tvEquation.text.toString()

        binding.tvResult.text = try {
            expression = ExpressionBuilder(equation).build()
            expression.evaluate().toString()
        } catch (e: Exception){
            Log.e("TAG", "onEqualClicked: $e", )
            "Error"
        }

        clearEquation = true
    }
}