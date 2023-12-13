//TODO: Ahora crea otra función que lo eleve al cuadrado y evite las excepciones.

//EN ESTA FUNCION VAMOS A RECIBIR EL NUMERO QUE HEMOS INTRODUCIDO EN LA FUNCION EJEMPLO1 Y LO USAREMOS AQUI
fun ejemplo2(numero: Int): Int {
    //RECIBIMOS EL DATO POR TECLADO
    println("Introduce un número entero:\n")
    var numero = readlnOrNull()
    var index = 1
    try {
        while (numero != null) {


                /*SI EL VALOR DE numero NO ES NULO, LE DAMOS EL FORMATO DEL TIPO DE DATO
                QUE QUEREMOS, EN ESE CASO DOUBLE*/
                //ELEVAMOS AL CUADRADO EL NUMERO INTRODUCIDO
                var numElevadoCuadrado = cuadrado(numero.toInt())
                //IMPRIMIMOS CADA OPERACION QUE REALICEMOS, MIENTRAS SE INTRODUCEN NUMEROS
                println("$index: $numElevadoCuadrado")
                index++

            println("Introduce otro numero o presiona \'ENTER\' para finalizar")
            numero = readln()

            /*AL METER UNA CADENA VACIA (PRESIONANDO ENTER) CUMPLIMOS LA CONDICION Y SALDREMOS
            DEL PROGRAMA.*/
            if (numero == "") {
                println("Has presionado \'ENTER\'\nSaliendo del programa")
                break
            }
            else {
                continue
            }
        }
    }
    catch (e: NumberFormatException) {
        println("Debe introducir un número entero.")
    }

}//FIN PROGRAMA