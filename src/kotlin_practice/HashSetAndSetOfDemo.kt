package kotlin_practice

fun main(args:Array<String>) {
    // and if setOf have same value then automatic removed same value
   var myset = setOf<Int>(1,2,4,5,87,7,65,22,44,88,55,2) // this setOf are actually immutable we can't add any value of this

    for (element in myset){
        println(element)
    }
    println()

    // Remember also in hashSetOf print actually unsequential
    // and if hashSetOf have same value then automatic removed are same value
    var myHashSet = hashSetOf<Int>(4,5,8,6,4,8,5,49,6,65)// this hashSetOf are mutable we can also add new value of this
   with(myHashSet) {
       add(77)
       add(88)
       add(99)
   }

    for (element in myHashSet){
        println(element)
    }
    println("Size of = ${myHashSet.size}")

    println()


    // and if mutableSetOf have same value then automatic removed same value
    // mutableSetOf print sequential
    var mutableSet = mutableSetOf<String>("Polash","Najmus","Sakib","Mamun")


    mutableSet.apply {
        add("Anik")
        add("Anik")
        add("Anwer")
    }

    for (element in mutableSet){
        println(element)
    }



}