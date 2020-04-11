package kotlin_practice

fun main(args:Array<String>) {

    // this the immutable data
    //immutable means we can not change our element it's fixed we have no change the element
    // immutable data also read immutable data can not write
    var list = listOf<String>("Riyadh","Najmus","Anik","Polash")

    list.add("Mamun") // in this line showing some error
                     // this the immutable data we can not add any data at any time


    for (element in list){
        println(element)
    }

}