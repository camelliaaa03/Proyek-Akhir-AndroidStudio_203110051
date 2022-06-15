package id.camelliaalfina.kumpulan_doa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Kategori2Activity : AppCompatActivity() {
    private lateinit var rvKategori2: RecyclerView
    private var list: ArrayList<Kategori2> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori2)

        rvKategori2 = findViewById(R.id.rv_kategori2)
        rvKategori2.setHasFixedSize(true)

        list.addAll(Kategori2Data.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvKategori2.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListKategori2Adapter(list)
        rvKategori2.adapter = listHeroAdapter
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