package kotlin_practice

fun main(args:Array<String>) {
    // Immutable read only
    // Immutable that's means we can not add any value/data in future cz this are immutable
    var myMap = mapOf<Int, String>(1 to "Anik", 3 to "Polash" , 55 to "Najmus", 21 to "Mamun")

    for (key in myMap.keys){
        println("Value of immutable = $key ${myMap[key]}")

    }
    println()

    // Mutable also read and write
    // Mutable we also add new value in future
    var hashMap = HashMap<Int,String>()
    hashMap.apply {
        put(1,"Kamrul")
        put(5,"Hridoy")
        put(8,"Nasim")
        put(7,"Monir")
        put(2,"Khan")
        put(6,"Mosarof")
    }

    for (key in hashMap.keys){
        println("Value of mutable $key = ${hashMap[key]}" )
    }


}


