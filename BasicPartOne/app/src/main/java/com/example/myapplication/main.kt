package com.example.myapplication

import kotlin.contracts.Returns

fun characterShapes() {

    val str = """ Testing Sring 
        |Testing var
        |Testing var
        |Testing var
    """.trimMargin()
    println(str)
    println("Testing")
    var name = "Testing 2"
    var text: String = ".... Testing Name: Cassio L"
    println(name + "      ")
    println(text)
}

fun numericalVariable() {

    var age = 18
    var kg = 1.0

    println("Age : $age kg $kg")
}

fun changeableAndunchangeblevariable() {

    //variaveis mutaveis
    var name1 = "Testing"

    //variaveis inmutaveis
    val name2: String

    name2 = "Project"
    // name2 = "2"

    println("Text 1 $name1  text 2 $name2 ")
}

fun ifElseAge(age: Int) {
    if (age >= 18) {
        println("Over age")
    } else {
        println("Under age")
    }
}

fun trueFalseege(age: Int): Boolean {

    return age >= 18
}

fun calcBonus(office: String, salary: Float): Float {

    val bonus: Float
    if (office == "Coordinator") {
        bonus = salary * 0.2f
        println("Coordinator Bonus $bonus")
    } else if (office == "Manager Jr") {
        bonus = salary * 0.5f
        println("Manager Jr Bonus $bonus")

    } else {
        bonus = salary * 2
        println("Manager Sr Bonus $bonus")
    }
    return bonus
}

fun calcBonusSimplifying(office: String, salary: Float): Float {


    return if (office == "Coordinator") {
        salary * 0.2f
    } else if (office == "Manager Jr") {
        salary * 0.5f

    } else {
        salary * 2
    }
}

fun ternarOperator() {

    val valueS = 10;

    //For java Strng str  = valor  == 10 ? "sim" : "não ";
    val str = if (valueS == 10) "values is equal " else "values is equal"

}

fun operatorElvis() {

    val test: Int? = null
    val op: Int = test ?: 100
    println(op)
}


fun main() {
    operatorElvis()
    println(calcBonusSimplifying("Coordinator", salary = 1000f))
    println(calcBonusSimplifying("Manager Jr", salary = 1000f))
    println(calcBonusSimplifying("manager Sr", salary = 1000f))

    println(calcBonus("Coordinator", salary = 1000f))
    println(calcBonus("Manager Jr", salary = 1000f))
    println(calcBonus("manager Sr", salary = 1000f))
    numericalVariable()
    changeableAndunchangeblevariable()
    ifElseAge(10)
    characterShapes()
    println(trueFalseege(19))
    println(ternarOperator())
}


