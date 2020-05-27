package com.example.viewpagerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpViewPager()
    }

    private fun setUpViewPager() {
        val adaptor = MyViewPageStateAdapter(supportFragmentManager)
        adaptor.addFragment(MainFragment(),"Hello")
        adaptor.addFragment(MainFragment(),"Hello 2")
        adaptor.addFragment(MainFragment(),"Hello 3")
        viewPager.adapter = adaptor
        tabLayout.setupWithViewPager(viewPager)

    }
}
