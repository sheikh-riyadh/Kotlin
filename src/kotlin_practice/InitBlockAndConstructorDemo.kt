package kotlin_practice

fun main(args:Array<String>) {

    var student = Student("Riyadh",350883)
    student.disply()

}


class Student(name:String,roll:Int){ // but in this constructor we can not initialize
    lateinit var name: String       // we used init block than we initialize
    var roll: Int =0               //  in kotlin actually used this system
    init {
        this.name =name
        this.roll =roll
    }

    fun disply(){
        println(name)
        println(roll)
    }

}
