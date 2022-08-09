fun main(args: Array<String>) {
    var a1: Int = 5;
    var a2: Double = 10.0;
    var a3: Short = 123;
    var a4: Float = 30.0f;
    var a5: Byte = 120;
    var a6: Char = '#';
    var a7: Boolean = false;
    var a8: String = "Kotlin";
    var cast: Double = a1.toDouble();

    // Operations....
    var ft: String = ""
    var op: String = "Kotlin"
    println("Value ft : " + ft.isEmpty())
    println("Value op : " + op.isEmpty())

    var tr: String = "Programming"
    println("Combine : "+tr.plus(" Language"))

    // Null Pointer

    var point: String? = null
////    println(point)
//    point = "Kotlin Tutorial"
////    println(point)

    var mm: String? = "Can be null"
    var nn: String? = null
    println(mm!!)
    println(nn!!)

    println("Name ?")
    var name : String = readLine()!!
    println("Surname ?")
    var surname :String = readLine()!!
    println("Age ?")
    var age :Int = readLine()!!.toInt()
//    var result : String = "Name : $name Surname : $surname Age : $age";
//    println(result)

    var range = 10..20;

    var yoxla : Boolean = 18 in range;

    println(yoxla)

    var newRange = range.step(2)
    var result = 12 in newRange
    println(result)

    var deyer: Int = 20;

    if (deyer > 10) {
        println("false")
    } else {
        println("false")
    }

    println("Please enter anything number : ")
    var value: Int = readLine()!!.toInt()

    when (value) {
        10 -> println("Enter value $value")
        12 -> println("Enter value $value")
        15 -> println("Enter value $value")
        else->{
            println("You entered value is different value")
        }
    }

    for (x in 1..10){
        println("x : $x")
    }

    var a : Int = 0;

    while (a<=10){
        println("a : $a")
        a++
    }

    var co: Int = 0;
    do {
        println("co : $co")
        co++
    } while (co <= 5)

    fun sumNumbers(x: Int, y: Int): Int {
        return x + y

    }

    println("X + Y = "+sumNumbers(3,4))

    fun Int.extensionMethod(): Int {
        return this + 123;
    }

    println(3.extensionMethod())


    infix fun Int.countVB(apple: Int): Int = this - apple;

    println(3.countVB(10))


}
