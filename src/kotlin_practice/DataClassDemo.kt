package kotlin_practice

fun main(args:Array<String>) {

    var bike = Bike("Hero","Dark")
    println("Bike name : ${bike.name}\nBike color : ${bike.color}")
}


data class Bike(var name:String , var color: String){ // data class we can not use parameter data class also use properties like var/val

}