package kotlin_practice

fun main(args:Array<String>) {

    var myArray1 = Array<String>(4){"Riyadh"}
    var myArray2 = Array<Int>(5){0}


    for (element1 in myArray1){ // myArray start 0..4
        println(element1)
    }
    for (element2 in myArray2){
        println(element2)
    }


}