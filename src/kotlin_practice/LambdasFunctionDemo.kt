package kotlin_practice

fun main(args:Array<String>) {

     var result = ob(5,7)
    println(result)

}

var ob :(Int, Int) -> Int = {x,y  ->  x+y} // this the lambdas function


