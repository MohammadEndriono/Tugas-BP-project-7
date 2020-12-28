package inheritancee

class Dosen : karyawan(){
    var prodi : String=""

    fun mengajar(){
        println("saya mengajar di Prodi $prodi")
    }
}