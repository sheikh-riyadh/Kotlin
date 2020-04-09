package kotlin_practice

fun main(args:Array<String>) {


    ObjectKeywordDemo.name ="Riyadh" // we never make a reference variable we can direct access function and variable
    ObjectKeywordDemo.display()
}

object ObjectKeywordDemo {
    var name : String =""
    fun display(){
        println("Hi i'm object component ")
    }
}