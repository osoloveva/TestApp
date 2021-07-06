package ru.osoloveva.testapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView1: TextView
    private lateinit var button1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView1 = findViewById(R.id.textView1)
        button1 = findViewById(R.id.button1)

        button1.setOnClickListener {
            when (textView1.text) {
                "1 stage" -> textView1.text = "2 stage"
                "2 stage" -> textView1.text = "3 stage"
                else -> {
                    textView1.text = "Done"
                }
            }
        }
    }

}