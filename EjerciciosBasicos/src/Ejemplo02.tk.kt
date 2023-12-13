//TODO: Ahora crea otra función que lo eleve al cuadrado y evite las excepciones.

//EN ESTA FUNCION VAMOS A RECIBIR EL NUMERO QUE HEMOS INTRODUCIDO EN LA FUNCION EJEMPLO1 Y LO USAREMOS AQUI
fun ejemplo2(numero: Double): Double {
    try {
        val numElevadoCuadrado = numero * numero
        return numElevadoCuadrado
    }//FIN TRY

    catch (e: NumberFormatException) {
        println("Error: Número no válido.")
        return 0.0
    }//FIN CATCH
}//FIN PROGRAMA