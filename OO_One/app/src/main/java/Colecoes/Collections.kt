package Colecoes

fun main (){
    //list - array, set ,hashmap

    val l1 =  listOf("porco","cavalo","galinha")
    println(l1)

    val l2 =  mutableListOf("porco","cavalo","galinha")
    println(l2)

    val a1 =  arrayListOf("porco","cavalo","galinha")
    println(a1)



    val s1 =  setOf("porco","cavalo","galinha","galinha")
    println(s1)
    val s2 =  mutableListOf("porco","cavalo","galinha","galinha")
    println(s2)



    val n1 = mapOf(Pair("key", "value"), Pair("galinha", "cavalo"))
    println(n1)

    val n2 = mutableListOf(Pair("key", "value"), Pair("galinha", "cavalo"))
    println(n2)



}