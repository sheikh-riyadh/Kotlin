package kotlin_practice

fun main(args:Array<String>) {

    // if we initialize our variable is null then we should use (?) null safe
    // 1. null safe ( ?. )
    // return the length  if 'name' is not null else return null

    var name : String? = null
    println("Name : ${name?.length}") // we can not print null variable if we print null variable then use safe operator (?)



    // 2. Safe call with let ( ?.let )
    // If executed block only if 'name' not null

    name?.let {
        println("Name : ${name.length}") // this block executed if name is not null otherwise not executed the block
    }



    // 3. Elvis-operator ( ?: )
    // When we have nullable reference 'name', we can say "in name is not null" use it
    // otherwise use some non-null

           var len = if (name!=null)
                name.length
            else
                -1
    println(len)


    var length = name?.length?:-1 // this code are same on up code
    println(length)




    // 4. Non-null assertion operator (!!)
    // use it when you are sure the value is not null
    //throws nullPointException

    println("${name!!.length}")
}