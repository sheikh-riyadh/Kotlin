package kotlin_practice

fun main(args:Array<String>) {
    var demo2 = Demo2()
    demo2.


}

open class Demo1 {
    private lateinit var name : String
    protected var roll: Int =0
    internal lateinit var shift: String
    public lateinit var department : String
}

class Demo2 : Demo1() { // in this line we inherit the Demo1 class

    fun visibility(){
        var demo2 = Demo2()
        demo2.name="Riyadh" // in this line showing some error because of name variable actually private
        demo2.shift ="1st" // same of shift variable because shift variable also internal actually internal are same as public
        demo2.department = "Computer" // this line we actually access department variable because of it's public
        demo2.roll = 350883 // in this line we access roll variable because of we inherit Demo1 class but roll variable we can not access other class

    }

}

