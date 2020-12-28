package polymhorphismee

fun main(){
    val endri = Dosen()
    endri.nama = "Endri"
    endri.alamat="minomartani"
    endri.perkenalan()
    endri.gaji = 1000000
    endri.bekerja()
    endri.prodi="sistem informasi"
    endri.mengajar()
    println()

    val roman = Mahasiswa()
    roman.nama="roman"
    roman.alamat="plosokuning"
    roman.perkenalan()
    roman.prodi="SI"
    roman.belajar()
    println()

    val wendy= Satpam()
    wendy.nama="wendy"
    wendy.alamat="kasihan"
    wendy.perkenalan()
    wendy.gaji = 5000000
    wendy.bekerja()
    wendy.pos=" barat"
    wendy.menjaga()
    println()

    val indonesia = indonesia()
    indonesia.benua="Asia"
    indonesia.bahasa="Indonesia"
    indonesia.kemerdekaan="17 Agustus 1945"
    indonesia.negara="Indonesia"
    indonesia.negara()
    indonesia.suku="dayak"
    indonesia.indonesia()
    println()

    val inggris = inggris()
    inggris.benua="Eropa"
    inggris.bahasa="Inggris"
    inggris.kemerdekaan="24 Agustus 1300"
    inggris.negara="Inggris"
    inggris.negara()
    inggris.musim="salju"
    inggris.inggris()
    println()

    val china = china()
    china.benua="Asia"
    china.bahasa="mandarin"
    china.kemerdekaan="1 Januari 2000"
    china.negara="China"
    china.negara()
    china.pemerintahan="komunis"
    china.china()
    println()

    val brazil = brazil()
    brazil.benua="Amerika"
    brazil.bahasa="portugis"
    brazil.kemerdekaan="7 September 1822"
    brazil.negara="Brazil"
    brazil.negara()
    brazil.agama="katolik"
    brazil.brazil()
    println()

    val australia = australia()
    australia.benua="Australia"
    australia.bahasa="inggris"
    australia.kemerdekaan="26 Januari 1788"
    australia.negara="Australia"
    australia.negara()
    australia.ibukota="canberra"
    australia.australia()
    println()

    val myanmar = myanmar()
    myanmar.benua="Asia"
    myanmar.bahasa="Sino-tibetan"
    myanmar.kemerdekaan="4 Januari 1948"
    myanmar.negara="myanmar"
    myanmar.negara()
    myanmar.suku="arakan"
    myanmar.indonesia()
    myanmar.myanmar()
    println()

    val rusia = rusia()
    rusia.benua="Eropa"
    rusia.bahasa="slavia"
    rusia.kemerdekaan="6 Desember 1917"
    rusia.negara="Rusia"
    rusia.negara()
    rusia.namasebelum="Uni Soviet"
    rusia.rusia()
    println()

    val spanyol = spanyol()
    spanyol.benua="Eropa"
    spanyol.bahasa="spanyol"
    spanyol.kemerdekaan="24 Mei 1822"
    spanyol.negara="spanyol"
    spanyol.negara()
    spanyol.ibukota="Madrid"
    spanyol.australia()
    spanyol.spanyol()
    println()

    val nigeria = nigeria()
    nigeria.benua="Afrika"
    nigeria.bahasa="inggris"
    nigeria.kemerdekaan="3 Agustus 1960"
    nigeria.negara="Nigeria"
    nigeria.negara()
    nigeria.warna="Hijau"
    nigeria.nigeria()
    println()


}