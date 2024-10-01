package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val newSize = intent.getIntExtra("textSizes", 0)

        with (findViewById<TextView>(R.id.lyricsDisplayTextView)) {
            textSize = newSize.toFloat()
        }


    }
}