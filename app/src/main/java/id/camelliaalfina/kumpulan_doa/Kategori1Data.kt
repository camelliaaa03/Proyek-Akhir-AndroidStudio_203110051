package id.camelliaalfina.kumpulan_doa

object Kategori1Data {
    private val kategori1Names = arrayOf(
        "Doa Pengamalan Rutin 1",
        "Doa Pengamalan Rutin 2",
        "Doa Pengamalan Rutin 3",
        "Doa Pengamalan Rutin 4",
        "Doa Pengamalan Rutin 5",
        "Doa Pengamalan Rutin 6",
        "Doa Pengamalan Rutin 7",
        "Doa Pengamalan Rutin 8",
        "Doa Pengamalan Rutin 9",
        "Doa Pengamalan Rutin 10",
        "Doa Pengamalan Rutin 11",
        "Doa Pengamalan Rutin 12",
        "Doa Pengamalan Rutin 13"
        )
    private val kategori1Details = arrayOf(
        "LAA ILAAHA ILLALLAHU WAHDAHUU LAA SYARIIKA LAHUU, LAHUL MULKU WA LAHUL HAMDU WA HUWA 'ALAA KULLI SYAI'IN QADIR",
        "SUBHANALLAH WABIHAMDIHI",
        "SUBHAANALLAAHI WA BIHAMDIHI, SUBHAANALLAAHIL 'AZHIIM",
        "LAA ILAAHA ILLALLAAHU WALLAAHU AKBAR, WA LAA HAULA WA LAA QUWWATA ILLAA BILLAAH",
        "ASTAGHFIRULLAAHAL LADZII LAA ILAAHA ILLAA HUWAL HAYYUL QAYYUUMU WA ATUUBU ILAIH",
        "RADHIITU BILLAAHI RABBAN WA BIL-ISLAAMI DIINAN WA BIMUHAMMADIN RASUULAN",
        "SUBHAANAKALLAAHUMMA WA BIHAMDIKA ASYHADU ANLAA ILAAHA ILLAA ANTA ASTAGHFIRUKA WA ATUUBU ILAIKA",
        "RABBIGHFIRLII WA TUB 'ALAYYA, INNAKA ANTAT TAWWAABUR RAHIIM",
        "BISMILLAAHILLADZII LAA YADHURRU MAAS MIHI SYAI  UN FIL ARDHI WA LAA FIS SAMAAI WA HUWAS SAMII'UL 'ALIIM",
        "ALLAAHUMMA ANTA RABBII LAA ILAAHA ILLAA ANTA KHALAQTANII WA ANAA 'ABDUKA WA ANAA 'ALAA 'AHDIKA WA WA'DIKA MASTATHA'TU, A'UUDZU BIKA MIN SYARRI MAA SHANA'TU WA ABUU-U LAKA BINI'MATIKA 'ALAYYA WA A'TARIFU BIDZUNUUBII FAGHFIR LII DZUNUUBII, INNAHU LAA YAGHFIRUDZ DZUNUUBA ILLAA ANTA",
        "LAA-ILAAHA ILLALLAHUL 'ADZIIMUL HALIIM, LAA-ILAAHA ILLALLAH RABBULARSYIL 'AZHIIMI LAA-ILAAHA ILLALLAH RABBUS SAMAAWAATI WARABBUL ARDLI WARABBULASYIL KARIIMI",
        "AI HAMDULILLAAHILLAADZII 'AAFAANII MIMMAABTALAAKA BIHI WA FADHDHALANII 'ALAA KATSIIRIN MIMMAN KHALAQA TAFDHIILAN",
        "SUBHANALLAH 100X\n" +
                "\n" +
                "AI HAMDULILLAAH 100X\n" +
                "\n" +
                "LAA ILAAHA ILLALLAAH 100X\n" +
                "\n" +
                "ALLAAHU AKBAR 100X"
    )
    private val kategori1Images = intArrayOf(
        R.drawable.gb1,
        R.drawable.gb1,
        R.drawable.gb1,
        R.drawable.gb1,
        R.drawable.gb1,
        R.drawable.gb1,
        R.drawable.gb1,
        R.drawable.gb1,
        R.drawable.gb1,
        R.drawable.gb1
    )
    val listData: ArrayList<Kategori1>
    get() {
        val list = arrayListOf<Kategori1>()
        for (position in kategori1Names.indices){
            val kategori1 = Kategori1()
            kategori1.name = kategori1Names[position]
            kategori1.detail = kategori1Details[position]
            kategori1.photo = kategori1Images[position]
            list.add(kategori1)
        }
        return list
    }
}