package com.example.midterm_dorian_loris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.midterm_dorian_loris.fragements.apicallFragment
import com.example.midterm_dorian_loris.fragements.displayFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apicallFragment = apicallFragment()
        val displayFragment = displayFragment()

        changeFragment(apicallFragment)

        findViewById<BottomNavigationView>(R.id.bottom_nav).setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_apicall -> {
                    changeFragment(apicallFragment)
                    true
                }
                R.id.ic_display -> {
                    changeFragment(displayFragment)
                    true
                }
                else -> false
            }
        }
    }
    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fragment)
            commit()
        }
    }
}


