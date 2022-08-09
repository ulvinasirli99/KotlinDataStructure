package oop.interfaces

class InterfaceUnderstand : LearnInterface {
    override var variable: Int
        get() = 20
        set(value) {}
    override var count: Int
        get() = 100
        set(value) {}

    override fun showLogDataInLog() {
        println("TODO(\"Not yet implemented\")")
    }
}

fun main() {
    var interfaceUnderstand=InterfaceUnderstand()
    println(interfaceUnderstand.variable)
    println(interfaceUnderstand.count)
    println(interfaceUnderstand.showLogDataInLog())
}