import kotlin.time.Duration.Companion.milliseconds

/* TODO:
Mejorar la función anterior con lo siguiente:
1. Muestra el resultado solo si ha introducido un número entero válido y es inferior a 1000
(lanzar excepción si es superior).
//VAMOS A CAMBIAR ESTA CONDICION DIRECTAMENTE EN ejemplo1 QUE ES DONDE PIDO EL DATO POR TECLADO.
2. Utiliza ahora en el mensaje de error la variable de tipo Exception. Pero no debe mostrar
delante del tipo de excepción la cadena de caracteres "java.lang."
3. Evita también que se actualice el contador o índice que se muestra si estamos pidiendo
el mismo número porque se ha producido un error en su entrada.
*/
fun ejemplo5() {

    var indice = 0
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
                indice ++
                val numDoble = numero * 2
                val numeroCuadrado = numCuadrado(numero)


                println("$indice.- Tu número es el: $numero\n" +
                        "El doble es: $numDoble\n" +
                        "Elevado al cuadrado es: ${numeroCuadrado}\n")

            }

            //INDICAMOS QUE EL BUCLE FINALIZARA CUANDO SE INGRESE UNA CADENA VACIA MODIFICANDO LA FUNCION ejemplo1
        }while (numero != null)
        println("Saliendo del programa.")

    }catch (e: NumberFormatException){
        println("Debes introducir un número entero.")
    }
}