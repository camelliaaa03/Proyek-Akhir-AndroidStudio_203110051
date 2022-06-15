package id.camelliaalfina.kumpulan_doa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Kategori4Activity : AppCompatActivity() {
    private lateinit var rvKategori4: RecyclerView
    private var list: ArrayList<Kategori4> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori4)

        rvKategori4 = findViewById(R.id.rv_kategori4)
        rvKategori4.setHasFixedSize(true)

        list.addAll(Kategori4Data.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvKategori4.layoutManager = LinearLayoutManager(this)
        val listKategori4Adapter = ListKategori4Adapter(list)
        rvKategori4.adapter = listKategori4Adapter
    }
}