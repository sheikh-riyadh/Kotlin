package kotlin_practice

import java.util.*

fun main(args:Array<String>) {

    var reader = Scanner(System.`in`)
    println("Please enter your number :")
    var userNumber = reader.nextInt()

  var value = when(userNumber)
    {
        1->"one"
        2->"two"
        3->"three"
        4->"four"
        5->"five"
        6->"six"
        7->"seven"
        8->"eight"
        9->"nine"
        10->"ten"
        else ->"Number is unknown $userNumber"
    }

    println(value)
}