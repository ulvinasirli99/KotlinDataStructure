package oop

import dataTypes.Home

class User() : Computer() {

    var userName: String? = "Ulvi";
    var userSurname: String? = "Nasirov";

}

fun main() {
    var computer = Computer()
    computer.computerForm()
    var user = User()
    println(user.userName.toString())
    println(user.userSurname.toString())
    var home = Home(42, "alma");
    println(home.writeBloc())
}