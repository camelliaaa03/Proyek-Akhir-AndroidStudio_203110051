package id.camelliaalfina.kumpulan_doa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardmuqoddimah: CardView = findViewById(R.id.cardmuqoddimah)
        cardmuqoddimah.setOnClickListener(this)

        val textViewMuqoddimah: TextView = findViewById(R.id.textViewMuqoddimah)
        textViewMuqoddimah.setOnClickListener(this)

        val imgKategori1: ImageView = findViewById(R.id.imgKategori1)
        imgKategori1.setOnClickListener(this)

        val kategori1: CardView = findViewById(R.id.kategori1)
        kategori1.setOnClickListener(this)

        val kategori2: CardView = findViewById(R.id.kategori2)
        kategori2.setOnClickListener(this)

        val kategori3: CardView = findViewById(R.id.kategori3)
        kategori3.setOnClickListener(this)

        val kategori4: CardView = findViewById(R.id.kategori4)
        kategori4.setOnClickListener(this)

        val profile: ImageView = findViewById(R.id.profile)
        profile.setOnClickListener(this)

        val saran: ConstraintLayout = findViewById(R.id.saran)
        saran.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.cardmuqoddimah -> {
                val moveIntent = Intent(this@MainActivity, MuqoddimahActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.textViewMuqoddimah -> {
                val moveIntent = Intent(this@MainActivity, MuqoddimahActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.imgKategori1 -> {
                val moveIntent = Intent(this@MainActivity, Kategori1Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.kategori1 -> {
                val moveIntent = Intent(this@MainActivity, Kategori1Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.kategori2 -> {
                val moveIntent = Intent(this@MainActivity, Kategori2Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.kategori3 -> {
                val moveIntent = Intent(this@MainActivity, Kategori3Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.kategori4 -> {
                val moveIntent = Intent(this@MainActivity, Kategori4Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.profile -> {
                val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.saran -> {
                val moveIntent = Intent(this@MainActivity, SaranActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}