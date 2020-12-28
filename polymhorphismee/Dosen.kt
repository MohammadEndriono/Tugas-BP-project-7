package polymhorphismee
class Dosen : karyawan(){
    var prodi : String=""

    fun mengajar(){
        println("saya mengajar di Prodi $prodi")
    }
    override fun perkenalan() {
        println("halo semuanya! apa kabar kalian?, perkenalkan nama saya $nama  dan alamat saya di $alamat")
    }
}