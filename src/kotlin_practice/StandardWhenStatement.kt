package kotlin_practice

import java.util.*

fun main(args:Array<String>) {

    var reader = Scanner(System.`in`)
    println("Please enter your number : ")
    var number = reader.nextInt()

   var result = when (number){

        1->"Your number is one"
        2->"Your number is two"
        3->"Your number is three"
        4->"Your number is four"
        5->"Your number is five"
        6->"Your number is six"
        7->"Your number is seven"
        8->"Your number is eight"
        9->"Your number is nine"
        10->"Your number is ten"
        else->"Out of my area"
    }
    println(result)
}