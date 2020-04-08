package kotlin_practice

fun main(args:Array<String>) {

    var abstractDemoUpdated : AbstractDemoUpdated // We can not created abstract object we can create abstract variable

    abstractDemoUpdated = Rohim() // abstract variable reference Rohim class
    abstractDemoUpdated.sendMassage() // reference variable can call override function of Rohim class

    abstractDemoUpdated = Korim() //abstract variable reference Korim class
    abstractDemoUpdated.sendMassage() // reference variable can call override function of Korim class
}

abstract class AbstractDemoUpdated {

    abstract fun sendMassage() // abstract function

}
class Rohim : AbstractDemoUpdated(){

    override fun sendMassage() {//abstract function we must overridden otherwise showing error
        println("Hello korim ")
    }

}
class Korim : AbstractDemoUpdated(){
    override fun sendMassage() {// abstract function we must overridden otherwise showing error
        println("Hi rohim ")
    }

}