package id.camelliaalfina.kumpulan_doa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Kategori3Activity : AppCompatActivity() {
    private lateinit var rvKategori3: RecyclerView
    private var list: ArrayList<Kategori3> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori3)

        rvKategori3 = findViewById(R.id.rv_kategori3)
        rvKategori3.setHasFixedSize(true)

        list.addAll(Kategori3Data.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvKategori3.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListKategori3Adapter(list)
        rvKategori3.adapter = listHeroAdapter
    }
}