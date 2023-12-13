//TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.

//EN ESTA FUNCION RECIBIREMOS UN NUMERO Y DEVOLVEREMOS SU VALOR DUPLICADO
fun ejemplo1(numero: Double): Double {

    try {
        return numero * 2
    }//FIN TRY

    catch (e: NumberFormatException) {
        println("Error: Número no válido.")
        return 0.0
    }//FIN CATCH

}//FIN PROGRAMA