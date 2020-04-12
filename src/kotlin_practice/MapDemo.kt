package kotlin_practice

fun main(args:Array<String>) {

    var list = listOf<Int>(5,7,8,2,4,6,23,9,10)

    var squareNumber = list.map { it*it }

    println("Number of square = $squareNumber \n") // this line also print together



    for (square in squareNumber){
        println("Number of square = $square") // this line print single line
    }



}