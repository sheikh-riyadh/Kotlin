package kotlin_practice

fun main(args:Array<String>) {

    evenOdd1(8)

  var result =  evenOdd2(5)
    println(result)



}

fun evenOdd1(a : Int){
    if (a%2==0){
        println("Even : $a")
    }
    else{
        println("Odd : $a")
    }
}

fun evenOdd2(a : Int) : String = if (a%2==0) "Even : $a " else "Odd : $a"