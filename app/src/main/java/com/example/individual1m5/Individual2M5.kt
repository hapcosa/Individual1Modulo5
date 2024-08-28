package com.example.individual1m5

fun main(){
    var flagQuit:Boolean = true;
    do{
        var temp : Double=0.0;
        var option:Int=0;
        var flag: Boolean=false
        println("Conversión de temperaturas \nIngresa el numero de la opcion para convertir")
        println("1. Celsius a Farenheit \n2. Farenheit a Kelvin \n3. Celsius a Kelvin"+
        "\n4. Kelvin a Farenheit \n5. kelvin a Celsius \n6. Farenheit a Celsius \n7. Salir ")
        println("opcion: ")
        do{
            try{
                option  = readln().toInt()
                flag =true
            }catch(e : NumberFormatException){
                println("Debes ingresar un número válido, intente nuevamente: ")

            }
        }
        while(!flag)
        if(option <7 && option >0) {
            print("Ahora ingrese una temperatura: ")
            do {
                try {
                    temp = readln().toDouble()
                    flag = false
                } catch (e: NumberFormatException) {
                    println("Debes ingresar una temperatura válida, intente nuevamente")

                }
            } while (flag)
        }
            when(option){
                1-> convertCelciustoFarenheit(temp)
                2-> convertFarenheittoKelvin(temp)
                3-> convertCelciustoKelvin(temp)
                4-> convertKelvintoFarenheit(temp)
                5-> convertKelvintoCelcius(temp)
                6-> convertFarenheittoCelcius(temp)
                7->flagQuit=false
                else -> flagQuit= opcionValidar()

            }

    }while(flagQuit)
}

fun opcionValidar():Boolean{
    println("debe ingresar una opcion valida")
    return true
}
fun convertKelvintoFarenheit( Temp:Double){
    val Farenheit = (Temp - 273.15) * 9/5 + 32
    println("Kelvin: "+Temp+"\nFarenheit: "+Farenheit)
}
fun convertCelciustoFarenheit( Temp:Double){

    val Farenheit = Temp * 9/5 + 32
    println("Celcius :"+Temp +"\nFarenheit: "+Farenheit)
}
fun convertKelvintoCelcius( Temp:Double){
  
    val Celcius = Temp - 273.15
    println("Kelvin: "+Temp+"\nCelcius: "+Celcius)
}
fun convertFarenheittoCelcius( Temp:Double){
  
    val Celcius = (Temp - 32) * 5/9
    println("Farenheit :"+Temp+"\nCelcius: "+Celcius)
}
fun convertFarenheittoKelvin( Temp:Double){
   
    val Kelvin = (Temp + 459.67) * 5/9
    println("Farenheit :"+Temp+"\nKelvin: "+Kelvin)
}
fun convertCelciustoKelvin( Temp:Double){
   
    val Kelvin = Temp + 273.15
    println("Celcius :"+Temp +"\nKelvin: "+Kelvin)
}