package com.example.coraapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//private val MainActivity.time: Any

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtText = findViewById<EditText>(R.id.edtTime)
        val txtDisplay = findViewById<TextView>(R.id.txtDisplay)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnCalculate.setOnClickListener()
        {
            val time = edtText.text.toString().toInt()

            if (time in 6..9) {
                txtDisplay.text = "☀️ Morning: send a 'Good morning' text to a family member."
            } else if (time in 10..11) {
                txtDisplay.text = "☕ Mid-morning: Reach out to a colleague with a quick 'Thank you'."
            } else if (time in 12..15) {
                txtDisplay.text = "🔗 Afternoon: Share a funny meme or interesting link with a friend."
            } else if (time in 16..17) {
                txtDisplay.text = "🥨 Afternoon Snack Time: Send a quick 'thinking of you' message."
            } else if (time in 18..20) {
                txtDisplay.text = "🍽️ Dinner: Call a friend or relative for a 5-minute catch-up."
            } else if (time in 21..24 || time in 0..5) {
                txtDisplay.text = "🌙 After Dinner / Night: Leave a thoughtful comment on a friend's post."
            } else {
                // Error handling for invalid hours
                txtDisplay.text = "Please enter a valid hour between 0 and 24! ✨"
            }
        } //else {
            txtDisplay.text = "Don't forget to enter the hour! Cora is waiting. 😊"



// Add this to make your Reset button work
    btnClear.setOnClickListener {
        edtText.text.clear()
        txtDisplay.text = ""
    }
















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}