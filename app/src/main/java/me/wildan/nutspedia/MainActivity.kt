package me.wildan.nutspedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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
        showRecyclerListView()
    }

    private fun moveToDetail(nuts: Nuts) {
        val moveIntent = Intent(this,DetailActivity::class.java)
        moveIntent.putExtra(DetailActivity.EXTRA_NAME, nuts.name)
        moveIntent.putExtra(DetailActivity.EXTRA_PHOTO, nuts.photo)
        moveIntent.putExtra(DetailActivity.EXTRA_DESC, nuts.desc)
        startActivity(moveIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
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

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
                val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}