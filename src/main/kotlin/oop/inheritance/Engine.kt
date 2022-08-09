package oop.inheritance

class Engine(count: String, result: String, var doorCount: Int) : Machine(count, result) {
    override fun showInScreen() {
        super.showInScreen()
        println()
        println("Engine doorCount : ${doorCount.toString()}")
    }
}

fun main() {
    var engine = Engine("2000","Okay",4)
    println(engine.showInScreen())
}