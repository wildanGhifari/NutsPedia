package me.wildan.nutspedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import me.wildan.nutspedia.Nuts
import me.wildan.nutspedia.NutsData
import me.wildan.nutspedia.ListViewAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvNuts: RecyclerView
    private var list: ArrayList<Nuts> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNuts = findViewById(R.id.rv_nuts)
        rvNuts.setHasFixedSize(true)

        list.addAll(NutsData.listData)
        showRecyclerListView()
    }

    private fun moveToDetail(nuts: Nuts) {
        val moveIntent = Intent(this,DetailActivity::class.java)
        moveIntent.putExtra(DetailActivity.EXTRA_NAME, nuts.name)
        moveIntent.putExtra(DetailActivity.EXTRA_PHOTO, nuts.photo)
        moveIntent.putExtra(DetailActivity.EXTRA_DESC, nuts.desc)
        startActivity(moveIntent)
    }

    private fun showRecyclerListView() {
        val listViewNutsAdapter = ListViewAdapter(list)

        rvNuts.layoutManager = LinearLayoutManager(this)
        rvNuts.adapter = listViewNutsAdapter

        listViewNutsAdapter.setOnItemClickCallback(object : ListViewAdapter.OnItemClickCallback{
            override fun onItemClicked(item : Nuts) {
                moveToDetail(item)
            }
        })
    }
}