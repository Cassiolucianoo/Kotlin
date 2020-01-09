package heranca

interface Funcionario {

    fun calculaBonus()
}

class Gerente : Funcionario {
    override fun calculaBonus() {
        println("bonus 500")
    }

}

class Tecnico : Funcionario {
    override fun calculaBonus() {
        println("bonus 500")
    }

}

fun man() {

    val f1: Funcionario = Gerente()
    val f2: Funcionario = Gerente()

}

fun calculo(f: Gerente) {

    //logica
}

fun calculo(f: Tecnico) {

    //logica
}