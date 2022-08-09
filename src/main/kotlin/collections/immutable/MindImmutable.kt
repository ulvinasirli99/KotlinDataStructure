package collections.immutable

fun main(args: Array<String>) {
    var list = listOf(true, "Ski", "Value", 331)
    println(list.toSet().toString())
    /*
    So, in this case, the list is not mutable.
    That is you don"t add any element to list....
    For this you use listOf and listOfNotNull
    Because this 2 elements never change
     */
}