package com.example.dynamicfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dynamicfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFragment2.setOnClickListener {
            supportFragmentManager
                .beginTransaction().replace(R.id.placeHolder, BlankFragment2.newInstance())
                .commit()
        }

        supportFragmentManager
            .beginTransaction().replace(R.id.placeHolder, BlankFragment.newInstance())
            .commit()
    }
}