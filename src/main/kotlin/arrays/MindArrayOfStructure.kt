package arrays

fun main(args: Array<String>) {
    var manyArray = arrayOf(2, "Kotlin", "Learn", "Improve", "And etc....")
    println(manyArray[0])
    println(manyArray[1])
    println(manyArray[2])
    println()
    manyArray[1] = "Learn Kotlin"
    println(manyArray[1])
    println()
    var doubleArrayOfm = doubleArrayOf(2.34,92.24,131.31,1313.13,-131.1314)
    println(doubleArrayOfm.toSet())
}