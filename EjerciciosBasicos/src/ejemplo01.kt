import kotlin.reflect.typeOf

//TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.
fun ejemplo1(): Pair<Int, Boolean> {

    try {
        println("Ingresa un número entero: ")
        return readln().toInt() to true
    }catch (e: NumberFormatException){
        println("Formato no permitido.")
        return 0 to false
    }
}

