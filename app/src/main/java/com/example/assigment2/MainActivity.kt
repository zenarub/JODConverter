package com.example.assigment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.dollar -> {
                val x = DollarFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, x).commit()
                return true
            }
            R.id.euro -> {
                val y = EuroFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, y).commit()
                return true
            }
            R.id.pound -> {
                val z = PoundFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, z).commit()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

