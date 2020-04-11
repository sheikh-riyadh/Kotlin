package kotlin_practice

import kotlin_practice.Persion2

fun main(args:Array<String>) {

    // this the normal way to call our persion variable

    var persion = Persion()
    persion.name ="Najmus Sakib"
    persion.roll =350887
    persion.department ="Computer"
    persion.phone ="01967912588"
    persion.infoDisplay()





    // this the standard way we can not call again and again to the persion object
    var persion2 = Persion2()
    with(persion2){
       name = "Polash"
       roll =350875
       department ="Computer"
       phone = "01988093396"
       infoDisplay()
   }



    // this the second way how to initialize without object
   var persion3 = Persion3()
    persion3.apply {
        name = "Anik"
        roll = 350913
        department = "Computer"
        phone = "01846092658"
    }.infoDisplay()

}

open class Persion (){

    lateinit var name: String
    var roll: Int =0
    lateinit var department: String
    lateinit var phone: String



    fun infoDisplay () {
        println("Name : $name")
        println("Roll : $roll")
        println("Department : $department")
        println("Phone : $phone")
        println("\n")
    }
}

class Persion2: Persion()
class Persion3: Persion()





