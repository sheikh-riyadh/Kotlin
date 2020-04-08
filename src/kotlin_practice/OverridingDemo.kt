package kotlin_practice

fun main(args:Array<String>) {

    var cat = Cat()
    cat.display()


}

open class Animal{

   open var color : String ="black"

  open fun display(){
        println("Color : $color")
        println("Animal eating")
    }
}

class Cat :Animal() {

  override var color: String ="white"     // this part of overriding

    override fun display(){             // this part of overriding
        super<Animal>.display()
        println("Cat eating")
        println(color)

    }
}