package kotlin_practice

fun main(args:Array<String>) {


    //this the one way to connect concatenation

   var country : String ="Bangla"
    var countrylast : String = "desh"
    var fullNameOfCountry = country + countrylast

    println(fullNameOfCountry)

    // this the second way to connect concatenation

    var name : String = "Riyadh"
    var lastName :String = "Sheikh " + name
    println(lastName)

    // and this the standard way to connect concatenation

    var name2 : String = "Sakib"
    var lastNam : String = "Najmus $name2"

    println(lastNam)
}
