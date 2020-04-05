package kotlin_practice

fun main(args:Array<String>) {

    var x : Int =10
    var y : Int =22
  var result = x.graterThen(y)
    println(result)
}

fun Int.graterThen(other : Int) : Int { // In this function how actually work
     if (this>other){             // this keyword that means x  this=x
         return this              // and other means y other=y
    }
    else{
         return  other
    }
}