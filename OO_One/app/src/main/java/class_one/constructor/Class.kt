package class_one.constructor

class user

class user2(var name: String, val idade: Int)

class user3(var name: String) {

    var ano: Int? = null

    constructor(name: String, ano: Int) : this(name) {

        this.ano = ano
    }

    fun digaOi() {
        println("Olá meu nome :$name e nasci em $ano")
        println(ano)
    }
}

fun main() {

    val user3: user3 = user3(name = "zé")
    val user2: user3 = user3(name = "zé", ano = 13)
    user3.digaOi()
    user2.digaOi()


}