package arrays

fun main(args: Array<String>) {
    val arrayList = ArrayList<Int>()
    arrayList.add(41)
    arrayList.add(14)
    arrayList.add(42)
    arrayList.add(35)
    println("Array Value 0: "+ arrayList[0])
    println("Array Value 1: "+ arrayList[1])
    println("Array Value 2: "+ arrayList[2])
    println("Array Value 3: "+ arrayList[3])
    println()
    println("Deleted index : 3 "+arrayList.removeAt(3))
    println()
    for (i in arrayList){
        println("New Array List : $i")
    }
}