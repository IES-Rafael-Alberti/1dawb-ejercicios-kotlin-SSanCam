fun main() {

    //TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.
    fun ejemplo1(numero: Double): Double {
        try {
            val numeroDoblado = numero * 2
            return numeroDoblado
        } catch (e: NumberFormatException) {
            println("Error: Número no válido.")
            return 0.0
        }
    }
    //TODO: Ahora crea otra función que lo eleve al cuadrado y evite las excepciones.
    fun ejemplo2(numero: Double): Double {
        try {
            val numElevadoCuadrado = numero * numero
            return numElevadoCuadrado
        } catch (e: NumberFormatException) {
            println("Error: Número no válido.")
            return 0.0
        }
    }

        /* TODO:
     Mejorar la función anterior con lo siguiente:
     1. Crea un bucle, dónde se muestre un índice del número introducido cada vez y
     salga si pulsa ENTER, es decir, la cadena vacía.
     */
        //ejemplo3()

        /* TODO:
    Mejorar la función anterior con lo siguiente:
    1. Crea y utiliza una función que se llame cuadrado(), que reciba un número entero y retorne
    el resultado de elevarlo al cuadrado.
    2. Muestra al principio de la frase para pedir el número un índice que vaya contabilizando
    las veces que es solicitado un número.
    */
        //ejemplo4()

        /* TODO:
    Mejorar la función anterior con lo siguiente:
    1. Muestra el resultado solo si ha introducido un número entero válido y es inferior a 1000
    (lanzar excepción si es superior).
    2. Utiliza ahora en el mensaje de error la variable de tipo Exception. Pero no debe mostrar
    delante del tipo de excepción la cadena de caracteres "java.lang."
    3. Evita también que se actualice el contador o índice que se muestra si estamos pidiendo
    el mismo número porque se ha producido un error en su entrada.
    */
        //ejemplo5()
    println("Introduce un número:\n")
    val numeroIntroducido = readLine()?.toDouble() ?: throw IllegalArgumentException("")

    val resultado_ejemplo_1 = ejemplo1(numeroIntroducido)
    val resultado_ejemplo_2 = ejemplo2(numeroIntroducido)

    println("Tu número es el: $numeroIntroducido\n" +
            "El doble es: $resultado_ejemplo_1\n" +
            "Elevado al cuadrado es: $resultado_ejemplo_2\n")
}

