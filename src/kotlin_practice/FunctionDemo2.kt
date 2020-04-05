package kotlin_practice

import sun.security.util.Length

fun main(args:Array<String>) {

var result =findArea( 15 , 24)

    println(result)

    isDisply("Riyadh","Computer")

}

fun findArea(length : Int , breadth : Int): Int{
    return length * breadth
}

fun isDisply(name : String ,department : String) : Unit{
    println("Name : $name\nDepartment: $department")
}