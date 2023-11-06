package com.example.projectapiomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectapiomdb.databinding.ActivityMainBinding
import com.example.projectapiomdb.fragment.DataFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showFragment()
    }

    private fun showFragment() {
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = DataFragment()

        mFragmentTransaction.add(R.id.fl_data,mFragment).commit()
    }
}