package kotlin_practice

fun main() {

    // if condition is match all the element of list then return true otherwise false
    var check1 = listOf<Int>(7,5,4,8,66,12).all { it<10 }
    println(check1)

    // if condition is mach any element of list then return true otherwise false
    var check2 = listOf<Int>(7,85,457,154,1).any { it<10 }
    println(check2)

    // if condition is As many as match element of list then store the variable
    var check3 = listOf<Int>(45,87,245,1,42,4,5,2).count { it<10 }
    println(check3)

    // if condition is Any one of them match element of list then store the variable
    var check4 = listOf<Int>(45,87,245,1,42,4,5,2).find { it<10 }
    println(check4)



}