package kotlin_practice

import java.util.*

fun main(args:Array<String>) {

   var a : Int =10
   var b : Int =20
    // We actually did coding in java like this

   if (a>b){
       println(a)
   }
   else{
       println(b)
   }
    // But kotlin some differed like this and more easy

   var result = if (a > b) a else b
    println(result)



}