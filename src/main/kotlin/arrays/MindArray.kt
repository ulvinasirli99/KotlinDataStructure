package arrays

fun main(args: Array<String>) {
    val array = Array<Int>(10) { 0 }
    array[0] = 10
    array[2] = 23

    array.set(1, 89)
    array.set(3, 54)

    println("The list of Array : ${array.toSet()}")

    println()


    for (x in 0..array.size - 1) {
        println(array[x])
    }

    println()
    println()

    var check = 0
    while (check <= array.size - 1) {
        println(array[check])
        check++;
    }

}