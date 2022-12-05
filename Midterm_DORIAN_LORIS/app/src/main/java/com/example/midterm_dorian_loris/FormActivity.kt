package com.example.midterm_dorian_loris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        findViewById<Button>(R.id.addDataButton).setOnClickListener {
            val id = findViewById<EditText>(R.id.textID).text.toString()
            val userId = findViewById<EditText>(R.id.textUserID).text.toString()
            val title = findViewById<EditText>(R.id.textTitle).text.toString()

            val formOutput = findViewById<TextView>(R.id.formOutput)
            if (id.isNotEmpty() && userId.isNotEmpty() && title.isNotEmpty()) {
                formOutput.text = "Complete"
            }
            else {
                formOutput.text = "Incomplete form"
            }
        }

    }
}