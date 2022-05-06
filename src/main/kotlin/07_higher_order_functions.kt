fun main(args: Array<String>) {
    val numList = 1..20
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach{ n -> println(n)}

    val mult3 = makeMathfun(3)
    println("5 * 3 = ${mult3(5)}")
}

fun makeMathfun(num1 : Int): (Int) -> Int = {num2 -> num1 * num2}