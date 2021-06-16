package me.wildan.nutspedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvNuts: RecyclerView
    private var list: ArrayList<Nuts> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNuts = findViewById(R.id.rv_nuts)
        rvNuts.setHasFixedSize(true)

        list.addAll(NutsData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvNuts.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewAdapter(list)
        rvNuts.adapter = cardViewHeroAdapter
    }
}