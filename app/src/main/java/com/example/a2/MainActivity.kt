package com.example.a2

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Отримуємо посилання на TextView
        val orientationTextView: TextView = findViewById(R.id.orientationTextView)

        // Визначаємо оріентацію
        val orientation = resources.configuration.orientation
        when (orientation) {
            Configuration.ORIENTATION_PORTRAIT -> {
                orientationTextView.text = getString(R.string.orientation_portrait)
            }
            Configuration.ORIENTATION_LANDSCAPE -> {
                orientationTextView.text = getString(R.string.orientation_landscape)
            }
            Configuration.ORIENTATION_SQUARE -> {
                orientationTextView.text = getString(R.string.orientation_square) // Добавьте строку для этой константы
            }
            Configuration.ORIENTATION_UNDEFINED -> {
                orientationTextView.text = getString(R.string.orientation_undefined) // Добавьте строку для этой константы
            }
            else -> {
                orientationTextView.text = getString(R.string.orientation_unknown) // На всякий случай
            }
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item1 -> {
                // Дія для Item 1
                true
            }
            R.id.subitem1 -> {
                // Дія для Subitem 1
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
