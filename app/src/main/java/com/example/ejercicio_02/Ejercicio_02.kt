package com.example.ejercicio_02
import java.util.Calendar
    fun main(){
        print("Que edad tienes? ")
        var edad = readln().toInt()
        while(edad < 1 || edad > 100){
            println("Edad no valida")
            print("Que edad tienes?")
            edad = readln().toInt()
        }
        getPrecioEntrada(edad)
    }

    fun getPrecioEntrada(edad: Int){
        val calendar = Calendar.getInstance()
        val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)

        if (edad < 4){
           println("El precio de la entrada es: Gratis")
        }
        if (edad in 4..15){
            println("El precio de la entrada es: $15.000")
        }
        if (edad in 16..60){
            if(dayOfWeek in 2..3){
                println("El precio de la entrada es: $25.000")
            }else{
                println("El precio de la entrada es: $30.000")
            }
        }
        if (edad > 60){
            println("El precio de la entrada es: $20.000")
        }
    }
