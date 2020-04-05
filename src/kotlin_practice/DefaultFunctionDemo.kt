package kotlin_practice

fun main(args:Array<String>) {

   var result1 = add1(8,7,5)
    println(result1)

    var result2 = add2(7,3,5) // this function we passing 2 value or 3 value
    println(result2)                  // because of we initialized default value of this function

   var result3 = add2(5,5)      // this is not showing error because of this function
    println(result3)                // initialized default value

}
// this the normal function
fun add1 (a : Int, b : Int, c : Int) : Int{

    return a + b + c
}

fun add2 (a : Int, b : Int, c : Int = 10): Int{ // function called default function because of we actually initialized default value
    return a + b + c                            // in this function we passing 2 value or 3 value
}