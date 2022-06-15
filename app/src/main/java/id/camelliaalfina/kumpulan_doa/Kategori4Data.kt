package id.camelliaalfina.kumpulan_doa

object Kategori4Data {
    private val kategori4Names = arrayOf(
        "Doa berlindung dari fitnah",
        "Doa berlindung dari sifat penakut, pelit, malas dan fitnah",
        "Doa berlindung dari fitnah kehidupan dan kematian",
        "Doa berlindung dari dosa-dosa keberatan hutang dan pikun",
        "Doa berlindung dari dosa-dosa keberatan hutang dan pikun 2",
        "Doa berlindung dari musibah/celaka",
        "Doa berlindung dari amal jelek",
        "Doa berlindung dari kesesatan",
        "Doa berlindung dari jeleknya perbuatan anggota badan",
        "Doa berlindung dari penganiayaan"
    )

    private val kategori4Details = arrayOf(
        "RADHIINA BILLAHI RABBAN WABIL ISLAAMI DIINAN WABI MUHAMMADIN RASUULAN NA'UUDZU BILLAH MIN SUUIL FITANI",
        "ALLAHUMMA INNI A'UUDZUBIKA MINAL HAMMI WAL HAZANI WAL 'AJZI WAL KASALI WAL BUKHLI WAL JUBNI WA DLALA'ID DAINI WA GHALABATIR RIJAALI",
        "ALLAHUMMA INNI A'UUDZUBIKA MINAL 'AJZI WAL KASALI WAL JUBNI WAL BUKHLI WAL HARAMI WA A'UUDZUBILKA MIN 'ADZAABIL QABRI WA A'UUDZUBIKA MIN FITNATIL MAHYAA WAL MAMAAT",
        "Ya Allah, aku berlindung kepada-Mu dari rasa malas, kepikunan, kesalahan dan terlilit hutang, dan dari fitnah kubur serta siksa kubur, dan dari fitnah neraka dan siksa neraka dan dari buruknya fitnah kekayaan dan aku berlindung kepada-Mu dari buruknya fitnah kefakiran serta aku berlindung kepada-Mu dari fitnah Al Masih Ad Dajjal. Ya Allah, bersihkanlah kesalahan-kesalahanku dengan air salju dan air embun, sucikanlah hatiku dari kotoran-kotoran sebagaimana Engkau menyucikan baju yang putih dari kotoran. Dan jauhkanlah antara diriku dan kesalahan-kesalahanku sebagaimana Engkau jauhkan antara timur dan barat",
        "ALLAAHUMMAKFINII BIHALAALIKA 'AN HARAAMIK, WA AGHNINII BIFADHLIKA 'AMMAN SIWAAK",
        "ALLOHUMMA INNII A'UUDZUBIKA MIN JAHDILBALAA I WADAROKISYSYAQOO I WASUU ILQODLOO I WASYAMAATATIL A'DAA I",
        "ALLAHUMMA INNI A'UUDZU BIKA MIN SYARRI MAA 'AMILTU WA MIN SYARRI MAA LAM A'MAL",
        "ALLAHUMMA LAKA ASLAMTU WABIKA AAMANTU, WA'ALAIKA TAWAKKALTU WAILAIKA ANABTU WABIKA KHASHAMTU, INNII A'UUDZU BI'IZZATIKA LAA-ILAAHA-ILLAA ANTA ANTUDHILLANII, ANTAL HAYYUL LADZII LAA YAMUUTU WAL JINNU WAL INSU YAMUUTUNNA",
        "ALLAAHUMMA INNII A'UUDZU BIKA MIN SYARRI SAM'II, WA MIN SYARRI BASHARII, WA MIN SYARRI LISAANII, WA MIN SYARRI QALBII, WA MIN SYARRI MANIYYII",
        "ALLOHUMMA INNII A'UUDZUBIKA MINAL FAQRI WALQILLATI WADZDZILAATI WA AN TADZLIMA AU TUDZLUM"
    )

    private val kategori4Images = intArrayOf(
        R.drawable.gb4,
        R.drawable.gb4,
        R.drawable.gb4,
        R.drawable.gb4,
        R.drawable.gb4,
        R.drawable.gb4,
        R.drawable.gb4,
        R.drawable.gb4,
        R.drawable.gb4,
        R.drawable.gb4,
    )

    val listData: ArrayList<Kategori4>
        get() {
            val list = arrayListOf<Kategori4>()
            for (position in kategori4Names.indices) {
                val kategori4 = Kategori4()
                kategori4.name = kategori4Names[position]
                kategori4.detail = kategori4Details[position]
                kategori4.photo = kategori4Images[position]
                list.add(kategori4)
            }
            return list
        }
}