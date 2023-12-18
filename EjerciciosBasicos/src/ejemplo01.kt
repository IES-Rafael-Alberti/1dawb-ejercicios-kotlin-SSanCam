import kotlin.reflect.typeOf

//TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.
fun ejemplo1(): Int {

    try {

        println("Ingresa un número entero: ")
        val numeroIntroducido = readlnOrNull()


        if (numeroIntroducido != null){
            val numero = numeroIntroducido.toInt()
            return numero * 2
        }

    }catch (e: NumberFormatException){
        println("Formato no permitido.")
    }

    return 0
}

