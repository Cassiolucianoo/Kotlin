package class_one.classEnum

import class_one.gettersSetters.Maquina

enum class Prioridade1 {
    BAIXA, MEDIA, ALTA
}

enum class Prioridade2(val id: Int) {
    BAIXA(2){
        override fun toString():String {

            return "Super baixa, tranquilo"
        }

    }, MEDIA(3), ALTA(5)
}

class Alarme(var desk: String, p: Prioridade2)

fun main() {

    Prioridade1.BAIXA

    // Alarme ("Avido!", Prioridade2.ALTA)

    for (p in Prioridade2.values()) {

        if (p.toString() == "MEDIA") {

            println("Esse é verdadeiro")

        }

        println("$p - ${p.id} - ${p.ordinal}")
    }

}