package kotlin_practice

fun main(args:Array<String>) {

    var student1 = Student1()
    student1.name = "Riyadh"
    student1.roll =350883
    student1.department = "Computer"
    student1.shift = "1st"

    student1.display()

    var student2 = Student2()
    student2.name = "Najmus sakib"
    student2.roll =350885
    student2.department = "Computer"
    student2.shift = "1st"

    student2.display()

}

open class Person {
    lateinit var name : String
    var roll : Int = 0
   lateinit var department: String
   lateinit var shift : String


    fun display(){
        println("Student name : $name")
        println("Roll : $roll")
        println("Department of : $department")
        println("Shift :$shift")
        println("\n")
    }
}

class Student1 : Person() {

}

class Student2 : Person(){

}