package polymhorphismee



class Satpam : karyawan() {

    var pos : String=""

    fun menjaga(){
        println("saya menjaga di Pos $pos")
    }

    override fun perkenalan() {
        println("heiiiiiii, saya $nama alamat saya $alamat")
    }
}