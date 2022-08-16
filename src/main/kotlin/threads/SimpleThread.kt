package threads

class SimpleThread : Thread() {
    var officer = "Ulvi"

    override fun run() {
        println("$officer works")
        Thread.sleep(3000)
        println("$officer finished work")
    }
}

fun main(args: Array<String>) {
    var thread = SimpleThread()
    thread.run()
}