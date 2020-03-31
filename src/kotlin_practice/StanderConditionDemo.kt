package kotlin_practice

import java.util.*

fun main(args:Array<String>) {

    var reader = Scanner(System.`in`)
    println("Please enter your age : ")
    var age = reader.nextInt()

   var result = if (age>=18)"You are adult" else if (age in 13..18)"You are teenager" else "You are child"
    println(result)
}