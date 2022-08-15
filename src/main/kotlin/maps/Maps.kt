package maps

fun main(args: Array<String>) {
    var mapA = mapOf<Char,Any>('a' to " x",'b' to " 2000",'c' to " Kotlin Lang",'w' to 380)
    println("Key Answer of a : "+ mapA['a'])
    for (item in mapA)
    {
        println("answers mapA : >>>>> $item")
    }
}