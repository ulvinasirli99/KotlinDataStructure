package oop

open class Computer {
    var color: String? = null;
    var char: Char? = null;
    fun computerForm(): Unit {
        color = "Colors.red"
        char = '#'
        println(color + char)
    }
}