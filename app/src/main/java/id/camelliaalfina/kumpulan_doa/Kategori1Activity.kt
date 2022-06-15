package id.camelliaalfina.kumpulan_doa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Kategori1Activity : AppCompatActivity() {
    private lateinit var rvKategori1: RecyclerView
    private var list: ArrayList<Kategori1> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKategori1 = findViewById(R.id.rv_kategori1)
        rvKategori1.setHasFixedSize(true)

        list.addAll(Kategori1Data.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvKategori1.layoutManager = LinearLayoutManager(this)
        val listKategori1Adapter = ListKategori1Adapter(list)
        rvKategori1.adapter = listKategori1Adapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
            }
            R.id.action_grid -> {
            }
            R.id.action_cardview -> {
            }
        }
    }
}