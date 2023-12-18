fun ejemplo3 () {
    //VARIABLES LOCALES:
    var indice = 1
    var seguir: String
    var numero = 1

    //USO DE LAS FUNCIONES DE LOS EJEMPLOS//
    //RECIBIMOS POR TECLADO UN NUMERO PEDIDO AL USUARIO, QUE VAMOS A USAR EN LOS EJEMPLOS 1 Y 2
    try {
        do{ //SE INICIA UN BUCLE HASTA QUE SE LA CONDICION WHILE FINALICE

            // RECIBIMOS LOS DATOS QUE DEVUELVEN LAS FUNCIONES ejemplo1 Y ejemplo2
            //EJEMPLO_01
            //TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.

            //ASIGNAMOS UNA VARIABLE AL NUMERO QUE INTRODUCIMOS EN LA FUNCION ejemplo1
            val (num, numeroValido) = ejemplo1()
            if (numeroValido){
                numero = num
            }
            //EJEMPLO_02
            //TODO: Ahora crea otra función que lo eleve al cuadrado y evite las excepciones.
            //USAMOS EL NUMERO DADO EN EL ejemplo1 PARA DESARROLLA Y RECIBIR EL DATO TRAS SU USO EN ejemplo2
            val resultadoEjemplo2 = ejemplo2(num)
            val numDoble = num * 2
            //DEVOLVEMOS UN BLOQUE DE TEXTO CON LAS OPERACIONES PERTINENTES SEGUN ejemplo1 Y ejemplo2
            println("Tu número es el: $num\n" +
                    "El doble es: $numDoble\n" +
                    "Elevado al cuadrado es: $resultadoEjemplo2\n")
            //EJEMPLO_03
            /* TODO:
             Mejorar la función anterior con lo siguiente:
             1. Crea un bucle, dónde se muestre un índice del número introducido cada vez y
             salga si pulsa ENTER, es decir, la cadena vacía.*/
            println("Introduce otro número entero o pulsa \'Enter\' para finalizar: ")
            val seguirInput = readln()
            seguir = if (seguirInput.isNotBlank()){
                seguirInput.toInt().toString()
            }else{
                ""
            }

            //INCREMENTAMOS EL INDICE DESPUES DEL PRIMER CICLO DEL  BUCLE
            indice ++

            //INDICAMOS QUE EL BUCLE FINALIZARA CUANDO SE INGRESE UNA CADENA VACIA CON LA FUNCION .isNotBlank()
        }while (seguir.isNotBlank())
        //SI SE INGRESA UNA CADENA VACIA FINALIZA EL BUCLE Y MOSTRAMOS UN MENSAJE ANTES DE FINALIZAR EL PROGRAMA.
        if (seguir.isBlank()){
            println("Saliendo del programa.")
        }

    }catch (e: NumberFormatException){
        println("Debes introducir un número entero.")
    }
}

