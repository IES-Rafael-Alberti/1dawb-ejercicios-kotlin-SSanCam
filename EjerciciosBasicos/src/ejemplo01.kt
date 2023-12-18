//TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.
fun ejemplo1(): Int? {

    try {

        println("Ingresa un número entero (o pulsa ENTER para finalizar): ")
        val numero = readln().trim()
        return if (numero.isNotBlank())
                    numero.toInt()
                else null

    }catch (e: NumberFormatException){
        println("Formato no permitido.")
        return 0
    }
}

