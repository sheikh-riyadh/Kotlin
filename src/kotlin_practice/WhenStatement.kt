package kotlin_practice

import java.util.*

fun main(args: Array<String>) {

    var reader = Scanner(System.`in`)
    println("Please enter your number : ")
    var number = reader.nextInt()

   when(number){

        1-> println("Your number is one")
        2-> println("Your number is two")
        3-> println("Your number is three")
        4-> println("Your number is four")
        5-> println("Your number is five")
        6-> println("Your number is six")
        7-> println("Your number is seven")
        8-> println("Your number is eight")
        9-> println("Your number is nine")
        10-> println("Your number is ten")
       else -> println("Out of my area")
   }

}