// https://www.youtube.com/watch?v=H_oGi8uuDpA&list=WL&t=1552s
fun main(args: Array<String>) {
    val oneTo10 = 1..10
    println(oneTo10)

    val one = 1
    val ten = 10
    val oneToTen = one..ten
    println(oneToTen)

    val alpha = "A".."Z"

    println("R in alpha: ${"R" in alpha}")
    val tenTo1 = 10.downTo(1)

    val twoTo20 = 2.rangeTo(20)

    val rng = oneTo10.step(3)
    for(x in rng) println("rng3 : $x")

    for(x in tenTo1.reversed()) println("Reverse: $x")
}