package id.camelliaalfina.kumpulan_doa

object Kategori2Data {
    private val kategori2Names = arrayOf(
        "Doa sholat istikhoroh",
        "Doa sholat hajat",
        "Doa sholat tasbih",
        "Doa sholat dhuha",
        "Doa setelah witir",
        "Doa sholat jenazah",
        "Doa sholat jenazah 2"
    )
    private val kategori2Details = arrayOf(
        "ALLAHUMMA INNIY ASTAKHIIRUKA BI 'ILMIKA WA ASTAQDIRUKA BIQUDRATIKA WA AS-ALUKA MIN FADHLIKAL 'AZHIM, FAINNAKA TAQDIRU WA LAA AQDIRU WA TA'LAMU WA LAA A'LAMU WA ANTA 'ALLAAMUL GHUYUUB. ALLAHUMMA IN KUNTA TA'LAMU ANNA HAADZAL AMRU KHAIRUN LIY FIY DIINIY WA MA'AASYIY WA 'AAFIYATI AMRIY ('AAJILI AMRIY WA AAJILIHI) FAQDURHU LIY WA YASSIRHU LIY TSUMMA BAARIK LIY FIIHI. WA IN KUNTA TA'LAMU ANNA HAADZAL AMRU SYARRUN LIY FIY DIINIY WA MA'AASYIY WA 'AAFIYATI AMRIY (FIY 'AAJILI AMRIY WA AAJILIHI) FASHRIFHU 'ANNIY WASHRIFNIY 'ANHU WAQDURLIYL KHAIRA HAITSU KAANA TSUMMAR DHINIY",
        "LAA ILAAHA ILLALLAAHUL HALIIMUL KARIIM, SUBHANALLAAHI RABBIL 'ARSYIL 'ADZIIM, AL HAMDULILLAAHI RABBIL 'AALAMIIN, AS'ALUKA MUUJIBAATI RAHMATIKA WA AZAA'IMA MAGHFIRATIKA WAL GHANIIMATA MIN KULLI BIRRIN WAS SALAAMATA MIN KULLI ITSMIN, LAA TADA' LI DZAMBAN ILLAA GHAFARTAHU WALAA HAMMAN ILLAA FARRAJTAHU WALAA HAAJATAN HIYA LAKA RIDLAN ILLA QADLAITAHA YAA ARHAMAR RAHIMIIN",
        "SUBHAANALLAH WALHAMDULILLAH WA LAAILAAHA ILLALLAH WALLAHU AKBAR",
        "Ya Alloh, sesungguhnya waktu dhuha adalah waktu dhuha-Mu, keagungan adalah keagungan-Mu, keindahan adalah keindahan-Mu, kekuatan adalah kekuatan-Mu, penjagaan adalah penjagaan-Mu, Ya Alloh, apabila rezekiku berada di atas langit maka turunkanlah, apabila berada di dalam bumi maka keluarkanlah, apabila sukar mudahkanlah, apabila haram sucikanlah, apabila jauh dekatkanlah dengan kebenaran dhuha-Mu, kekuasaan-Mu (Wahai Tuhanku), datangkanlah padaku apa yang Engkau datangkan kepada hamba-hambaMu yang soleh",
        "SUBBHANAL MALIKIL QUDDUS",
        "ALLAHUMMAGHFIR LAHU WARHAMHU WA 'AAFIHI WAFU 'ANHU WA AKRIM NUZULAHU WA WASSI' MUDKHALAHU WAGHSILHU BILMAA'I WATS TSALJI WAL BARADI WA NAQQIHI MINAL KHATHAAYAA KAMAA NAQQAITATS TSAUBAL ABYADLA MINAD DANASI WA\n" +
                "\n" +
                "ABDILHU DAARAN KHAIRAN MIN DAARIHI WA AHLAN KHAIRAN MIN AHLIHI WA ZAUJAN KHAIRAN MIN ZAUJIHI WA ADKHILHUL JANNATA WA A'IDZHU MIN ADZAABIL QABRI (MIN 'ADZAABIN NAAR)",
        "ALLOHUMMAGHFIR LIHAYYINAA WA MAYYITINAA WA SYAAHIDINAA WA GHOO IBINAA WA DZAKARINAA WA UNTSAANAA WA SHOGHIIRINAA WA KABIIRINAA"
    )
    private val kategori2Images = intArrayOf(
        R.drawable.gb2,
        R.drawable.gb2,
        R.drawable.gb2,
        R.drawable.gb2,
        R.drawable.gb2,
        R.drawable.gb2,
        R.drawable.gb2
    )
    val listData: ArrayList<Kategori2>
        get() {
            val list = arrayListOf<Kategori2>()
            for (position in kategori2Names.indices) {
                val kategori2 = Kategori2()
                kategori2.name = kategori2Names[position]
                kategori2.detail = kategori2Details[position]
                kategori2.photo = kategori2Images[position]
                list.add(kategori2)
            }
            return list
        }
}