package kotlin_practice

val pi : Float  by lazy  { // we initialize float value but it's not memory allocate
    3.1416F               // when we use this value of our main function then allocate memory
                            // this the standard way
}

fun main(args:Array<String>) {


    var area = pi * 4 * 4
    println("Area of = $area")

}