package com.example.myfamily

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.nio.file.Files.move

class homeScreen : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)
        bottomBar.setOnItemSelectedListener {

  if(it.itemId==R.id.nav_guard){
      inflateFragment()

  }
            else if(it.itemId==R.id.nav_home){
                inflateFragmenthome()
  }


            true
        }
    }

    private fun inflateFragmenthome() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,HomeFragment.newInstance())
        transaction.commit()
    }

    private fun inflateFragment() {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()
    }
}
