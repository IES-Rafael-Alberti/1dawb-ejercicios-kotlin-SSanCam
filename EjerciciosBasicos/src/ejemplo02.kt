//TODO: Ahora crea otra función que lo eleve al cuadrado y evite las excepciones.

fun ejemplo2(numero: Int): Int {

    try {

        //RECIBIMOS EL NUMERO INTRODUCIDO A TRAVES DE LA FUNCION ejemplo1 Y DEVOLVEMOS SU CUADRADO
        return (numero * numero)

    }catch (e: NumberFormatException){

        println("Datos introducidos incorrectos.")
        return 0
    }

}
