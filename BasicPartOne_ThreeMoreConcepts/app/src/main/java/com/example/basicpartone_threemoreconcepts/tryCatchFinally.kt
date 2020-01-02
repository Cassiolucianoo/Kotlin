package com.example.basicpartone_threemoreconcepts

fun main(){


    try{
        println("1".toInt())

    }catch (e: NumberFormatException){
        println("This value is not a number.")
    }catch (e: NumberFormatException){
        println("Something went wrong.")
    } finally {
        println("test")
        println("Fundamentos")
    }
}