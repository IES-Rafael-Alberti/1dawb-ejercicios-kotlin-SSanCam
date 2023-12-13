/* TODO:
Mejorar la función anterior con lo siguiente:
1. Crea un bucle, dónde se muestre un índice del número introducido cada vez y
salga si pulsa ENTER, es decir, la cadena vacía.
*/
fun ejemplo3() {
    //RECIBIMOS EL DATO POR TECLADO
    print("Introduce un numero:")
    var numero = readlnOrNull()
    var index = 1

    while (numero != null){

        try {
            /*SI EL VALOR DE numero NO ES NULO, LE DAMOS EL FORMATO DEL TIPO DE DATO
            QUE QUEREMOS, EN ESE CASO DOUBLE*/
            //ELEVAMOS AL CUADRADO EL NUMERO INTRODUCIDO
            var numElevadoCuadrado = cuadrado(numero.toInt())
            //IMPRIMIMOS CADA OPERACION QUE REALICEMOS, MIENTRAS SE INTRODUCEN NUMEROS
            println("$index: $numElevadoCuadrado")
            index ++

        }
        catch (e: NumberFormatException){
            println("Debe introducir un número entero.")
        }
        println("Introduce otro numero o presiona \'ENTER\' para finalizar")
        numero = readln()

        /*AL METER UNA CADENA VACIA (PRESIONANDO ENTER) CUMPLIMOS LA CONDICION Y SALDREMOS
        DEL PROGRAMA.*/
        if (numero == ""){
            println("Has presionado \'ENTER\'\nSaliendo del programa")
            break
        }else{
            continue
        }
    }
}
