package me.wildan.nutspedia

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    private lateinit var ivImgReceived : ImageView
    private lateinit var tvNameReceived : TextView
    private lateinit var tvDescReceived : TextView

    private var title : String = "Detail"

    companion object {
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle(title)

        ivImgReceived = findViewById(R.id.img_item_photo)
        tvNameReceived = findViewById(R.id.tv_item_name)
        tvDescReceived = findViewById(R.id.tv_item_detail)

        val nutsPhoto = intent.getIntExtra(EXTRA_PHOTO,0)
        val nutsName = intent.getStringExtra(EXTRA_NAME)
        val nutsDesc = intent.getStringExtra(EXTRA_DESC)

        ivImgReceived.setImageResource(nutsPhoto)
        tvNameReceived.text = nutsName
        tvDescReceived.text = nutsDesc

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