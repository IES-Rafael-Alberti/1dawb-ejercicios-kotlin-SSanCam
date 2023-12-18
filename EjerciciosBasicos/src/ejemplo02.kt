//TODO: Ahora crea otra función que lo eleve al cuadrado y evite las excepciones.

fun ejemplo2(numero: Int): Int {
    try {

        return (numero * numero)

    }catch (e: NumberFormatException){
        println("Datos introducidos incorrectos.")
    }
    return 0
}
