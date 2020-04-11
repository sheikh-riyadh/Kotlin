package kotlin_practice

import java.awt.Stroke

fun main(args:Array<String>) {
    // this the mutable data
    // mutable data means we can also change our element
    //we can removed our element and we can also add new element

   var list = mutableListOf<String>("Anik","Polash","Najmus")

     list.add( "Riyadh")
     list.add( "Mamun")

    println("Index of mamun : ${list.indexOf("Mamun")}")

    println("Size of list : ${list.size}")

    for (element in list){
        println(element)
    }





}