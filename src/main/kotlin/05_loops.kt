
import java.util.Random

fun main(args: Array<String>) {
    for(x in 1..10){
        println("Loop: $x")
    }
    var i = 10
    while(i > 0) {
        println("$i")
        i--
    }

    for(x in 1..20){
        if(x % 2 == 0){
            continue
        }
        println("Odd: $x")

        if(x == 15) break

    }

    val myArray: Array<Int> = arrayOf(3,6,9)
    for(i in myArray.indices){
        println("Mult3 : ${myArray[i]}")
    }

    for((index, value) in myArray.withIndex()){
        println("Index : $index Value : $value")
    }

}