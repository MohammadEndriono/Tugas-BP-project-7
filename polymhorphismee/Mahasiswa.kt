package polymhorphismee
class Mahasiswa: Orang(){
    var prodi : String=""

    fun belajar(){
        println("saya belajar di Prodi $prodi")
    }
    override fun perkenalan() {
        println("hi how is it going?, i am $nama and stay in $alamat")
    }
}