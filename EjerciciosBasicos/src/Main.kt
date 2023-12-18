fun main(){
    //USO DE LAS FUNCIONES DE LOS EJEMPLOS//
    //RECIBIMOS POR TECLADO UN NUMERO PEDIDO AL USUARIO, QUE VAMOS A USAR EN LOS EJEMPLOS 1 Y 2
    try {
        println("Introduce un número:\n")
        val numeroIntroducido = readlnOrNull()?.toInt() ?: throw IllegalArgumentException("")


        // RECIBIMOS LOS DATOS QUE DEVUELVEN LAS FUNCIONES ejemplo1 Y ejemplo2
        //EJEMPLO_01
        //TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.
        val resultadoEjemplo1 = ejemplo1(numeroIntroducido)
        //EJEMPLO_02
        //TODO: Ahora crea otra función que lo eleve al cuadrado y evite las excepciones.
        val resultadoEjemplo2 = ejemplo2(numeroIntroducido)

        //DEVOLVEMOS UN BLOQUE DE TEXTO CON LAS OPERACIONES PERTINENTES SEGUN ejemplo1 Y ejemplo2
        println("Tu número es el: $numeroIntroducido\n" +
                "El doble es: $resultadoEjemplo1\n" +
                "Elevado al cuadrado es: $resultadoEjemplo2\n")

        //EJEMPLO_03
        /* TODO:
         Mejorar la función anterior con lo siguiente:
         1. Crea un bucle, dónde se muestre un índice del número introducido cada vez y
         salga si pulsa ENTER, es decir, la cadena vacía.*/

        val resultadoEjemplo3 = ejemplo3()
        println(resultadoEjemplo3)
    }
    catch (e: NumberFormatException){
        println("Debes introducir un número entero.")
    }
}