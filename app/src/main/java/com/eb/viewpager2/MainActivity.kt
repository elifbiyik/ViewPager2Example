package com.eb.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eb.viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.constraint, WithTabLayoutFragment())
                .addToBackStack(null)
                .commit()
        }
        binding.button2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.constraint, WithoutTabLayoutFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}
