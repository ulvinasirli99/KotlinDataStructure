package oop.accessTokens

open class AccessTokens {
    private fun privateSumMethod() {
        println("privateSumMethod")
    };
    protected fun sumMethod2() {
        println("sumMethod2")
    }
}

class AccessTokens2 : AccessTokens() {
    fun showSumMethodPrint() {
        this.sumMethod2()
    }
}

fun main(args: Array<String>) {
    var generateAccessTokens2 = AccessTokens2()
    println(generateAccessTokens2.showSumMethodPrint())
}