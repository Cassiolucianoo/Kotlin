package com.example.basicparttwo

fun main() {

    //for - loop
    //loop infinite

    val str  = "Cassio Lucinao "
    for ( c in str ){

        println("$c")
    }

    for (i in 0..100 step 5){
        if (i != 80){
            println("$i")
        }
    }

    for( j in 100  downTo 0){
        print("$j")

    }

}