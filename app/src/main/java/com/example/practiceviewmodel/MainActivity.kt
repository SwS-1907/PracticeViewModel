package com.example.practiceviewmodel

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.practiceviewmodel.VIewModel.CalcViewModel
import com.example.practiceviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var b:ActivityMainBinding
    var calcViewmodel = CalcViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b=ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)




            b.button.setOnClickListener {
                var name = b.name.text.trim().toString()
                var age = b.age.text.trim().toString()
                calcViewmodel.calcAge(name, age).observe(this, Observer {
                    b.textView3.text = " ${it.name} your age is ${it.birth} "
                })
            }
        }

}