package heranca

class Constantes private constructor() {
    companion object BANCO {
        val TABLE = "Pessoa"

        fun teste() {
            println("Sou um metodo estatico")
        }

    }

    object VENDAS {
        val TABLE_NAME = "Venda"

        object COLUNAS {
            val ID = "Id"
            val TOTAL = "Total"
        }
    }
}

fun main(){
    println(Constantes.TABLE)
    Constantes.teste()

    Constantes.BANCO.TABLE
    Constantes.BANCO.teste()

    Constantes.VENDAS.TABLE_NAME

}


