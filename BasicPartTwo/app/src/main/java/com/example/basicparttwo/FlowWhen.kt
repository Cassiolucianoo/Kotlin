package com.example.basicparttwo

fun operators() {
    var a = 10
    var b = 100

    when {

        a > 0 && b > 0 -> {
            println("Variable greate than zero")
        }

    }

    when {

        a in 1..99 && b > 0 -> {
            println("century")

        }
    }

}

fun main() {
    println(operators())
}
