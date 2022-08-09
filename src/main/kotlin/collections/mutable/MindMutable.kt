package collections.mutable

fun main(args: Array<String>) {
    var list = arrayListOf(3, false, true, "Mindset")
    list.set(1, true)
    println("Print 2 element : ${list[1]}")
    // And also you use mutableListOf for this Mutable List...
    println()
    var list2 = mutableListOf(3,34,false,"Java")
    list2.set(0,139)
    println("Value of Mutable list : "+list2[0])
}