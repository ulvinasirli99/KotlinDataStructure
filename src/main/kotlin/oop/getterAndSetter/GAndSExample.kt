package oop.getterAndSetter

class GAndSExample() {
    var name: String = ""
        get() = field
        set(value) {
            field = value
        }
}

fun main(args: Array<String>) {
    var gAndSExample = GAndSExample()
    gAndSExample.name = "Ulvi";
    println("Name of My : ${gAndSExample.name}")
}