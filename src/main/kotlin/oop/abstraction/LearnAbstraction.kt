package oop.abstraction

abstract class LearnAbstraction {
    abstract var spoiler: String
    abstract var count: Int
    var sum: String = "1000"
    abstract  fun sumOfVariables()
    fun printValueOnScreen(){
        println("Print Data without Abstraction....")
    }
}