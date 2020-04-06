package kotlin_practice

fun main(args:Array<String>) {

    var x : Int = 15
    var y : Int = 10
   var result = x max y
    println("Max number : $result")
}

infix fun Int.max( a: Int) : Int{
    if (this > a){
        return this
    }else{
        return a
    }
}