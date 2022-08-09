package dataClass

data class LearnDataClass(var name: String, var surName: String) {}

fun main(args: Array<String>) {

    var learnDataClass = LearnDataClass("Ulvi", "Nasir")

    var name:String=learnDataClass.name

    var surName:String=learnDataClass.surName

    println("Name : $name and Surname : $surName")

}

