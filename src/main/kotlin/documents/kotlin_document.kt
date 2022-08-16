package documents

import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    // Todo File Writer....................
    try {
        // Todo Using this writer we can create new file....
        /*
       todo If we don't close {var file = FileWriter("src/learn_kotlin.txt")} then in these names again initialize.
        That is why we must close this section and we create instance of this section from {  var fileA = FileWriter("src/learn_kotlin.txt", true) }
        That is 18 th section
         */
      //  var file = FileWriter("src/learn_kotlin.txt")
        println("Please enter your name and surname")
        var a = readLine()!!
        // Todo This section,that is append section is for save data...
        var fileA = FileWriter("src/learn_kotlin.txt", true)
        fileA.write(a + "\n")
        fileA.close()

        /*
          Todo  And We use as a second option we can write file
         */
        var fileName = "src/Data2.txt"

        var file2 = File(fileName)

        file2.createNewFile()
    } catch (e: Exception) {
        println("Something went wrong : $e")
    }

    println("Everything was successful")

    // Todo File Read.......................
    var fileC = FileReader("src/learn_kotlin.txt")
    fileC.forEachLine {
        println(it)
    }
}