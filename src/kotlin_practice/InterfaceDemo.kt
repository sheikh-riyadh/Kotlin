package kotlin_practice


fun main(args:Array<String>) {

    var teacher = Teacher()
    teacher.sendData()
    teacher.senMassage()

     // We can call two way

    var interfaceDemo : InterfaceDemo // Interface can not create any object because Interface not a class
    interfaceDemo = teacher
    interfaceDemo.senMassage()
    interfaceDemo.sendData()

}

interface InterfaceDemo {

    fun sendData(){ // It's just a normal function it's not abstract function

    }

    fun senMassage() // It's also abstract method because we know abstract method have no any body like this
}

class Teacher : InterfaceDemo{
    override fun senMassage() { // this method we also override otherwise showing error
        println("Hi i'm abstract method")
    }

    override fun sendData() { // this is optional, this method actually normal method because this method have body like this {}
        println("Hi i'm normal method")
    }
}