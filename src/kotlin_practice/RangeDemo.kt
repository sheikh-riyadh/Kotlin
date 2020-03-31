package kotlin_practice

fun main(args: Array<String>) {
    /*

   Three method in range
   1 downTo ,until , revered


    Example1:

    this code will print 1 to 10

     var range =1..10
     range.forEach{
     println(it)
     }

     Example2:

     this code will print revered number 10 to 1

     var range = 10.downTo(1)
     range.forEach{
     println(it)
     }

     this code will print revered number 10 to 1

     var range = 1..10
     range.reversed.forEach{
     println(it)
     }
    */

    var range = 1..10

    range.reversed().forEach{
        println(it)
    }

}