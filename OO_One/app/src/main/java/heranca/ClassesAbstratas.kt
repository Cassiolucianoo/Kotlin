package heranca

abstract class Mamifero(var nome: String) {

    var peso: Float = 0f

    abstract fun falar()
    open fun dormir() {

        println("ZzzzZZZzZzZ")
    }
}

class Cachorro(nome: String, myPeso: Float) : Mamifero(nome) {

    init {
        this.peso = myPeso
    }

    override fun falar() {
        println("Au, Auuuu")
    }

    class Gato(nome: String) : Mamifero(nome) {

        override fun falar() {
            println("Miau")
        }
    }

}

fun main() {

    Cachorro("Dog", 11.0f).dormir()

}

