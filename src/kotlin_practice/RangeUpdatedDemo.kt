package kotlin_practice

fun main(args:Array<String>) {

    var range = 1..10

    range.forEach {
        print(" $it")
    }

    println("\n\n")

    var range2 = 10 downTo 1

    range2.forEach {
        print(" $it")
    }

    println("\n\n")

   var range3 = 10..1
    range3.forEach {
        print(" $it")
    }

    println("\n\n")

   var range4 =1.until(10)

    range4.forEach {
        print(" $it")
    }

    println("\n\n")

   var range5 = 'A'..'Z'

   range5.forEach{
       print(" $it")
   }

    println("\n\n")

        // this code will search letter C in this range5
        // if this code find C then return true
        // and this code can not find C then return false

    var result = 'C' in range5
    println(result)


}