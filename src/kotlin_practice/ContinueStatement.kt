package kotlin_practice

fun main(args:Array<String>) {

    // Continue statement

    for (i in 1..5){

       if (i == 3){
           continue          /*In this code simply print 1,2,4,5
                              because we told if(i==3) then continue if our
                              condition are right then skip print() function

                             */
       }
        println(i)
    }
}
