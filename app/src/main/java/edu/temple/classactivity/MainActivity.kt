package edu.temple.classactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// different views used
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.textView)
        val btnLeft: Button = findViewById(R.id.btnLeft)
        val btnRight: Button = findViewById(R.id.btnRight)
        val enabler: CheckBox = findViewById(R.id.enabler)

        btnLeft.setOnClickListener {
            if (enabler.isChecked) {
                text.text = "Left"
            }
        }

        btnRight.setOnClickListener {
            if (enabler.isChecked) {
                text.text = "Right"
            }
        }
    }
}