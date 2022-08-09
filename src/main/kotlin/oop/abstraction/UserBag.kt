package oop.abstraction

class UserBag(override var spoiler: String, override var count: Int) : LearnAbstraction() {
    override fun sumOfVariables() {
        println("The Method Abstraction...")
    }
}

fun main(args: Array<String>) {
    var userBag = UserBag("Spoiler",1000)
    userBag.sumOfVariables()
    userBag.printValueOnScreen()
}