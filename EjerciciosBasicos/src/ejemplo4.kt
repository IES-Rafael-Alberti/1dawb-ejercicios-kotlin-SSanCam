/* TODO:
Mejorar la función anterior con lo siguiente:
1. Crea y utiliza una función que se llame cuadrado(), que reciba un número entero y retorne
el resultado de elevarlo al cuadrado.
2. Muestra al principio de la frase para pedir el número un índice que vaya contabilizando
las veces que es solicitado un número.
*/
fun ejemplo4() {

    //USO DE LAS FUNCIONES DE LOS EJEMPLOS//
    //RECIBIMOS POR TECLADO UN NUMERO PEDIDO AL USUARIO, QUE VAMOS A USAR EN LOS EJEMPLOS 1 Y 2
    try {
        do{ //SE INICIA UN BUCLE HASTA QUE SE LA CONDICION WHILE FINALICE

            // RECIBIMOS LOS DATOS QUE DEVUELVEN LAS FUNCIONES ejemplo1 Y ejemplo2
            //EJEMPLO_01
            //TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.

            //ASIGNAMOS UNA VARIABLE AL NUMERO QUE INTRODUCIMOS EN LA FUNCION ejemplo1
            val numero = ejemplo1()

            //EJEMPLO_02
            //TODO: Ahora crea otra función que lo eleve al cuadrado y evite las excepciones.
            //USAMOS EL NUMERO DADO EN EL ejemplo1 PARA DESARROLLA Y RECIBIR EL DATO TRAS SU USO EN ejemplo2
            if (numero != null ) {
                val numDoble = numero * 2
                val numeroCuadrado = numCuadrado(numero)

                println("Tu número es el: $numero\n" +
                        "El doble es: $numDoble\n" +
                        "Elevado al cuadrado es: ${numeroCuadrado}\n")
                //INCREMENTAMOS EL INDICE DESPUES DEL PRIMER CICLO DEL  BUCLE
            }

            //INDICAMOS QUE EL BUCLE FINALIZARA CUANDO SE INGRESE UNA CADENA VACIA MODIFICANDO LA FUNCION ejemplo1
        }while (numero != null)
        println("Saliendo del programa.")

    }catch (e: NumberFormatException){
        println("Debes introducir un número entero.")
    }
}
