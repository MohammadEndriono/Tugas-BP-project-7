fun main (){

    val endri : Human = Human("Endri")
    val adnan : Human = Human("Adnan")

    endri.email = "mohammad.firmansyah@students.amikom.ac.id"
    endri.address = "jl.rajawali RT29/11 Minomartani"

    adnan.email = "adnanintan@gmail.com"
    adnan.address = "maguwoharjo"

    endri.talk()
    adnan.talk()

    endri.introduce()
    adnan.introduce()

    println(endri.verify("mohammad.firmansyah@students.amikom.ac.id"))

    println(Endri.nama)

    val roman : Endri = Endri
    println(roman.kenegaraan)
}