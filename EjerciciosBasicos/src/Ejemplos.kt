
fun main() {

    //TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.
    /*
    fun ejemplo1(numero: Int): Int {


        try {
            return numero * 2
        }
        catch (e: NumberFormatException) {
            println("Error: Número no válido.")
            return 0.0
        }
    }
    */

    //TODO: Ahora crea otra función que lo eleve al cuadrado y evite las excepciones.
    /*
    fun ejemplo2(numero: Int): Int{

            val numElevadoCuadrado = numero * numero
            return numElevadoCuadrado

    }
    */

        /* TODO:
     Mejorar la función anterior con lo siguiente:
     1. Crea un bucle, dónde se muestre un índice del número introducido cada vez y
     salga si pulsa ENTER, es decir, la cadena vacía.
     */
    /*
     fun ejemplo3() {
        print("Introduce un numero:")
        var numero = readlnOrNull()
        var index = 1

            while (numero != null){

                try {
                    /*SI EL VALOR DE numero NO ES NULO, LE DAMOS EL FORMATO DEL TIPO DE DATO
                    QUE QUEREMOS, EN ESE CASO DOUBLE*/
                    var numeroFormat = numero.toDouble()
                    //ELEVAMOS AL CUADRADO EL NUMERO INTRODUCIDO
                    var numElevadoCuadrado = numeroFormat * numeroFormat
                    //IMPRIMIMOS CADA OPERACION QUE REALICEMOS, MIENTRAS SE INTRODUCEN NUMEROS
                    println("$index: $numElevadoCuadrado")
                    index ++

                }
                catch (e: NumberFormatException){
                    println("Debe introducir un número.")
                }
                println("Introduce otro numero o presiona \'ENTER\' para finalizar")
                var numero = readln()

                /*AL METER UNA CADENA VACIA (PRESIONANDO ENTER) CUMPLIMOS LA CONDICION Y SALDREMOS
                DEL PROGRAMA.*/
                if (numero == ""){
                    println("Saliendo del programa")
                    break
                }else{
                    continue
                }
            }
    }
    */

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

}

