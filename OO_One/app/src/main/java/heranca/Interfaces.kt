import class_one.gettersSetters.ligar

interface Maquina {

    fun ligar()
    fun desligar() {

        println("Off")

    }
}

class Computador : Maquina {
    override fun ligar() {


    }
}

interface interface01 {

    fun ola() {

        println("Interface01")
    }

}

interface interface02 {

    fun ola() {}

}


class ImplementaInterface : interface01, interface02 {
    override fun ola() {
        super<interface01>.ola()
    }
}

fun main() {

    ligar()

}