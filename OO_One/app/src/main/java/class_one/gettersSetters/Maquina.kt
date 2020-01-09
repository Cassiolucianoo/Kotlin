package class_one.gettersSetters

class Maquina(var marca: String)


fun ligar() {}
fun processar() {}
fun desligar() {}


fun man() {
    var m = Maquina("Gt")
    with(m) {
        ligar()
        processar()
        desligar()
    }
}