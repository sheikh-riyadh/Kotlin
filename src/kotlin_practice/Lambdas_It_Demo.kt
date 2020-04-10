package kotlin_practice

fun main(args:Array<String>) {

    revered("Hello",{it.reversed()}) // this the lambdas expression
}                                       // if only one parameter have lambdas then we used (it)

fun revered(str : String, lamb:(String)->String){ // this the higher level function with take parameter lambdas function
    var result1 = str
    println(result1)


    var result2 = lamb (result1)
    println(result2)
}