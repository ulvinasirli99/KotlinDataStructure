package dataTypes

class Home constructor(x: Int, apple: String) {

    var x : Int
    var apple :String

    init {
        this.x = x
        this.apple = apple
    }

    fun writeBloc(): Unit {
        println(x.toString() + apple)
    }
}