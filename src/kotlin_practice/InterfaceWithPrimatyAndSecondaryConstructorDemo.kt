package kotlin_practice

fun main(args:Array<String>) {

var persons = Persons("Riyadh","1st")

    var dog = Dog("White","Dog")
}

open class Students(name:String) {
    var name = name
    init {
        println("From super class : $name")
    }
}

class Persons(name : String , shift : String): Students(name){ // name return student class
    var shift = shift
    init {
        println("From child class Name : $name \n shift : $shift")
        println("\n")
    }
}


open class Animals {
    lateinit var color : String
    constructor(color: String) { // this is the super secondary constructor
        this.color = color
        println("From super class secondary constructor Color : $color")
    }

}

class Dog : Animals {

    constructor(color: String , name: String): super (color){ // this the child secondary constructor

        println("From child class secondary constructor Color : $color\nName : $name")
    }
}

