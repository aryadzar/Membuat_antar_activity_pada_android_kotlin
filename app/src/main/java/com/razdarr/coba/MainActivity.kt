package com.razdarr.coba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.buttonSkill)

        buttonSkills.setOnClickListener{
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
    }
}