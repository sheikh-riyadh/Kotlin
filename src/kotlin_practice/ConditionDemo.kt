package kotlin_practice

import java.util.*

fun main(args:Array<String>) {

    var reader = Scanner(System.`in`)

    println("Please enter your age : ")
    var age = reader.nextInt()

    if (age >= 18){
        println("You are adult")
    }else if (age in 13..18){
        println("You are teenager")
    }else{
        println("You are child")
    }





}