package kotlin_practice

fun main(args:Array<String>) {

    var student1 = Studernt("Polash")
    student1.display()

    var student2 = Studernt("Riyadh",350883)
    println(student2.name +" "+student2.id)
}

class Studernt(name: String){ // this the primary constructor
     var name: String
    var id : Int =-1
    init {
        this.name = name
    }

    fun display() {
        println(name)
    }

    constructor(name : String, Id :Int): this(name) { // this the secondary constructor
        this.id = Id
    }




}