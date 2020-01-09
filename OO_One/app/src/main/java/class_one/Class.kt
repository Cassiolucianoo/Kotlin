package class_one
class user

class user2 (var name: String, val idade: Int)

class user3 (var name: String, val idade: Int){
    fun digaOi(){
        println("Olá meu nome :$name")
    }
}

fun main(){

    val user3: user3 = user3 (name = "zé",idade = 13)
    user3.digaOi()
    println(user3.idade)
    println(user3.name)

}