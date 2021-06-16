package me.wildan.nutspedia

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNutsName: TextView = findViewById(R.id.tv_item_name)
        val tvNutsDesc: TextView = findViewById(R.id.tv_item_detail)
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvNutsName.text = name
        tvNutsDesc.text = desc
    }
}