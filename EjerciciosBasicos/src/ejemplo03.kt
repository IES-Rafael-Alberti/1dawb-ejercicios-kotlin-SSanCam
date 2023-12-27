fun ejemplo3 () {

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

                val resultadoEjemplo2 = ejemplo2(numero)
                val numDoble = numero * 2

                println("Tu número es el: $numero\n" +
                        "El doble es: $numDoble\n" +
                        "Elevado al cuadrado es: $resultadoEjemplo2\n")
                //INCREMENTAMOS EL INDICE DESPUES DEL PRIMER CICLO DEL  BUCLE
            }

            //INDICAMOS QUE EL BUCLE FINALIZARA CUANDO SE INGRESE UNA CADENA VACIA MODIFICANDO LA FUNCION ejemplo1
        }while (numero != null)
        println("Saliendo del programa.")

    }catch (e: NumberFormatException){
        println("Debes introducir un número entero.")
    }
}

