/* TODO:
Mejorar la función anterior con lo siguiente:

1. Crea y utiliza una función que se llame cuadrado(), que reciba un número entero y retorne
el resultado de elevarlo al cuadrado.

2. Muestra al principio de la frase para pedir el número un índice que vaya contabilizando
las veces que es solicitado un número.
*/
//ejemplo4()

fun cuadrado (numero: Int): String {
    if (numero > 1000){
        throw Exception("Debes introducir un número menor a 1000.")
    }
    else{
            val numCuadrado = numero * numero
            val resultado = ("Tu número: $numero, elevado al cuadrado es: $numCuadrado")
            return resultado
    }
}

