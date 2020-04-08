package kotlin_practice

fun main(args:Array<String>) {



}


abstract class AbstractDemo {

  open fun displayName() {}
   abstract fun displayRoll() // this the abstract function abstract function have never need body {}

}

class Demo : AbstractDemo(){

    override fun displayName() {//displayName function we can override because displayName function declared open keyword

    }

    override fun displayRoll() { // displayRoll function declared abstract keyword we must override abstract function otherwise showing error

    }

}
