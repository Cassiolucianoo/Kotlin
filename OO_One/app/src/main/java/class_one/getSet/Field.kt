class Field (var marca: String ){

    var nucleos: Int = 0

    get() {
        return field
    }
    set(value) {

        field  = value
    }

}

fun main (){

    var  f = Field("Gt")
    println(f.nucleos)
    f.nucleos = 10

}