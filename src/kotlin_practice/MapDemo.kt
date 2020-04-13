package kotlin_practice

fun main(args:Array<String>) {

    var list = listOf<Int>(5,7,8,2,4,6)
                                            // it actually 5,7,8,2,4,6
    var squareNumber = list.map { it*it } // it*it means (5*5,7*7,8*8,2*2,4*4,6*6)
    println("Number of square = $squareNumber \n") // this line also print together



    for (square in squareNumber){
        println("Number of square = $square") // this line print single line
    }



}