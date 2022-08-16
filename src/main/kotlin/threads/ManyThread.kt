package threads

class ManyThread(var officer: String) : Thread() {

    override fun run() {
        for (i in  1..5){
            println("$officer >>>>  $i : I works")
            println("The Officer is ready to work")

        }
        println()

        println("All works already finished")

        println()

    }

}

fun main(args: Array<String>) {
    var officerA = ManyThread("Officer-A")
    var officerB = ManyThread("Officer-B")
    var officerC = ManyThread("Officer-C")
    var officerD = ManyThread("Officer-D")

    officerA.setPriority(10)
    officerB.setPriority(Thread.NORM_PRIORITY)
    officerC.setPriority(Thread.MIN_PRIORITY)
    officerD.setPriority(Thread.MAX_PRIORITY)

    officerA.run()
    officerB.run()
    officerC.run()
    officerD.run()

}