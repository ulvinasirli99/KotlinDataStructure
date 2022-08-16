package exceptions

fun main(args: Array<String>) {
    try {
        println("Please enter one number : ")
        var number1: Int = readLine()!!.toInt()
        println("Please enter second number : ")
        var number2: Int = readLine()!!.toInt()
        var result: Int = (number1 / number2)
        println("Result of Program : $result")
    } catch (e: ArithmeticException) {
        println("Something is wrong....")
        println("Error result : $e")
        e.printStackTrace()
    }finally {
        println("This code works in any case")
    }
}