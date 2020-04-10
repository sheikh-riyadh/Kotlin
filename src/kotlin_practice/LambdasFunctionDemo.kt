package kotlin_practice

fun main(args:Array<String>) {

     var result = ob(5,7)
    println(result)

    higherFunction(7, 1 ,{x,y -> x + y})

}

var ob :(Int, Int) -> Int = {x,y  ->  x+y} // this the lambdas function


fun higherFunction(a: Int , b: Int , lambdas : (Int, Int)->Int){
    var valueOf = a * b
    println(valueOf)

   var result = lambdas(a,b)
    println(result)
}


