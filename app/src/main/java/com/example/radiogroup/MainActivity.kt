package com.example.radiogroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    lateinit var change: String
    lateinit var btnReset: MaterialButton
    lateinit var btnSubmit: MaterialButton
    lateinit var radioC: RadioButton
    lateinit var radioCplus: RadioButton
    lateinit var radioJava: RadioButton
    lateinit var radioPHP: RadioButton
    lateinit var radioPython: RadioButton
    lateinit var radioGroup: RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup()
    }

    private fun radioGroup(){
        btnReset = findViewById(R.id.btnReset)
        btnSubmit = findViewById(R.id.btnSubmit)
        radioC = findViewById(R.id.radioC)
        radioCplus = findViewById(R.id.radioCplus)
        radioJava = findViewById(R.id.radioJava)
        radioPHP = findViewById(R.id.radioPHP)
        radioPython = findViewById(R.id.radioPython)
        radioGroup = findViewById(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { _, id ->
            when(id){
                R.id.radioC -> {change = radioC.id.toString()
                }
                R.id.radioCplus -> {change = radioCplus.id.toString()
                }
                R.id.radioJava -> {change = radioJava.id.toString()
                }
                R.id.radioPHP -> {change = radioPHP.id.toString()
                }
                R.id.radioPython -> {change = radioPython.id.toString()
                }
            }
            change()
        }
    }

    private fun change(){
        btnSubmit.setOnClickListener {
            when (change) {
                radioC.id.toString() -> {
                    Toast.makeText(this, "This is C", Toast.LENGTH_SHORT).show()}
                radioCplus.id.toString() -> {
                    Toast.makeText(this, "This is C++", Toast.LENGTH_SHORT).show()}
                radioJava.id.toString() -> {
                    Toast.makeText(this, "This is Java", Toast.LENGTH_SHORT).show()}
                radioPHP.id.toString() -> {
                    Toast.makeText(this, "This is PHP", Toast.LENGTH_SHORT).show()}
                radioPython.id.toString() -> {
                    Toast.makeText(this, "This is Python", Toast.LENGTH_SHORT).show()}
            }
        }
        btnReset.setOnClickListener {
            radioGroup.clearCheck()
        }
    }
}