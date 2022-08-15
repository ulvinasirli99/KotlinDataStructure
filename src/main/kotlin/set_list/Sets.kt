package set_list

fun main(args: Array<String>) {
    // Todo This setOf method is immutable version. That is the map never change
    var setA = setOf(true, "Kotlin", 2, 41, "Kotlin", "value")
    var setASize = setA.size
    println("SetA Size : $setASize")
    for (item in setA) {
        println("Mutable map values : $item")
    }

    println()

    // Todo In this case the setOf map mutable.... That is, you can add new things to this map....
    var setB = mutableSetOf("Flutter", 342, "Kotlin", null, false)
    for (item in setB) {
        println("Mutable map values : $item")
    }
    println()
    setB.add(Math.PI)
    setB.remove(false)
    for (item in setB) {
        println("Mutable map values : $item")
    }
}