//TODO: Crea una función que pida un número y te muestre el resultado de duplicarlo.
fun ejemplo1(): Int?{
    /*ejemplo5: 1. Muestra el resultado solo si ha introducido un número entero válido y es inferior a 1000
    (lanzar excepción si es superior).*/

    try {

        println("Ingresa un número entero (o pulsa ENTER para finalizar): ")
        val numero = readln().trim()

        if (numero.isNullOrBlank()){
            return 0
        }

        val numeroConv = numero.toInt()
        if (numeroConv in 1..1000){
            return numero.toInt()
        }else{
            throw  Exception("Debes introducir un número entero entre 1-1000.")
        }

    }catch (e: NumberFormatException){
        println("Formato no permitido.")
        return null
    }
    catch (e: Exception){
        println(e.message)
        return null
    }
}
