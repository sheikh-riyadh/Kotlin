package kotlin_practice

fun main(args:Array<String>) {

    // this break work actually inner loop

    for (k in 1..3){   // outer loop
        for (l in 1..3){  // inner loop
            println("$k"+"$l")
            if (k==1 && l==1){
              break
            }
        }
    }

 println("\n\n\n\n")

    // And this break work inner and outer loop

   myloop@ for (i in 1..3){ // inner loop
      for (j in 1..3){ // outer loop
          println("$i"+"$j")
          if (i==2 && j==2){
              break@myloop
          }
      }
    }
}