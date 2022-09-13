package com.example.dicerolloer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnRoll:Button = findViewById<Button>(R.id.RollBtn)
        val tvResult:TextView = findViewById(R.id.tv)
        val imgDice:ImageView = findViewById(R.id.imgDice)

        btnRoll.setOnClickListener(){
            val number = (1..6).random()
            tvResult.text = number.toString()

            val drawableResource = when (number) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
                imgDice.setImageResource(drawableResource)

        }
    }
}