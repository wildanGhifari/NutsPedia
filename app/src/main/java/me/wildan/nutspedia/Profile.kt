package me.wildan.nutspedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity() {
    private var title : String = "About"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = title
    }
}