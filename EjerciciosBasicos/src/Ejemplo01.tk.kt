//TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.

//EN ESTA FUNCION PEDIREMOS UN NUMERO ENTERO Y DEVOLVEREMOS SU VALOR DUPLICADO
fun ejemplo1(): Int {
    println("Introduce un número entero: ")
    val numero = readln().toInt()
    try {
        return numero.times(2)
    }catch (e: NumberFormatException) {
        println("Error: Número no válido.")
        return 0
    }
}

