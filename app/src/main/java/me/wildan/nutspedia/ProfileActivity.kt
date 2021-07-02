package me.wildan.nutspedia

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    private var title : String = "About"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setActionBarTitle(title)


        val btnEmail: ImageButton = findViewById(R.id.email)
        btnEmail.setOnClickListener {
            val myEmail = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:wildghifari@gmail.com"))
            startActivity(myEmail)
        }

        val btnGithub: ImageButton = findViewById(R.id.github)
        btnGithub.setOnClickListener {
            val myGitHub = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/wildanGhifari"))
            startActivity(myGitHub)
        }

        val btnDribbble: ImageButton = findViewById(R.id.dribbble)
        btnDribbble.setOnClickListener {
            val myDribbble = Intent(Intent.ACTION_VIEW, Uri.parse("https://dribbble.com/wildant"))
            startActivity(myDribbble)
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = title
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}