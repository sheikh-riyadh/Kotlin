package kotlin_practice

fun main(args:Array<String>) {

    var mySetOf = setOf<Int>(4,8,7,5,9,33,54,11)

    var findEvenNumber = mySetOf.filter { it%2==0 }


    println("Even number are = $findEvenNumber") // this line will print together


    for (evenNumber in findEvenNumber){

        println("Even number are = $evenNumber") // in this line will print single line
    }






}


