package id.camelliaalfina.kumpulan_doa

object Kategori3Data {
    private val kategori3Names = arrayOf(
        "Doa Berbuka Puasa",
        "Doa Berbuka ",
        "Doa ketika Lailatul Qodar",
        "Doa Qunut Witir"
    )
    private val kategori3Details = arrayOf(
        "ALLAAHUMMA LAKA SHUMTU WA 'ALAA RIZQIKA AFTHARTU",
        "DZAHABAZH ZHAMAA'U WABTALLATIL 'URUUQU WA TSABATAL AJRU IN SYAA-ALLAAH",
        "ALLAAHUMMA INNAKA 'AFUWWUN KARIIMUN TUHIBBUL AFWA FA'FU 'ANNII",
        "Allahummahdini fiiman hadayta wa aafinii fiiman aafyata wa tawallanii fiiman tawallayta wa baariklii fiiman a thoyta waqinii syarro maa qodhoyta walla yuqdhoo alaika wa innahu laa yadzillu man waalayta walaa ya izzu man aadayta tabaarakta robbanaa wa ta aalayta."
    )
    private val kategori3Images = intArrayOf(
        R.drawable.gb3,
        R.drawable.gb3,
        R.drawable.gb3,
        R.drawable.gb3
    )
    val listData: ArrayList<Kategori3>
        get() {
            val list = arrayListOf<Kategori3>()
            for (position in kategori3Names.indices) {
                val kategori3 = Kategori3()
                kategori3.name = kategori3Names[position]
                kategori3.detail = kategori3Details[position]
                kategori3.photo = kategori3Images[position]
                list.add(kategori3)
            }
            return list
        }
}