package Basic

/**
 * Created by Aman gautam on 13-Jul-17.
 */
fun describe(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            parseInt(obj) -> "Integer"
            3, 4 -> "is 3 or 4"
            else       -> "Unknown"
        }

fun main(abs :Array<String>){
    //var x= readLine()!!.toInt();
    /* var y = when (x) {  ///////    a.k.a. switch in c, java
         1 -> {print("x == 1")
             print("one more thing....")}
         2 -> print("x == 2")
         3,4-> print(" 3 or 4")
         in 5..20 -> println("between 5 and 20")
         else -> {
             print("x is neither 1 nor 2")
         }

     }
     print(y)*/


    println(describe(1765677678567745453))  // range
    println(describe("Hello"))
    println(describe("#%$@3"))
}