package oop.inheritance

open class Machine(var deyer: String, var result: String) {
    var countR: String
    var resulT: String

    init {
        this.countR = deyer
        this.resulT = result
    }

   open fun showInScreen(): Unit {
        println("Deyer : $deyer , Result : $resulT")
    }
}