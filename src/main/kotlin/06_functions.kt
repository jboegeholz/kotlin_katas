fun main(args: Array<String>) {

    fun mult(num1 : Int, num2 : Int) : Int{
        return num1 * num2
    }
    println("5 + 4 = : ${mult(5, 4)}")
    fun add(num1 : Int, num2 : Int): Int = num1 + num2

    println("5 + 4 = : ${add(5, 4)}")

    fun subtract(num1 : Int=1, num2 : Int=1): Int = num1 - num2
    println("5 - 4 = : ${subtract(5, 4)}")

    println("5 - 4 = : ${subtract(num2 = 4, num1 = 5)}")

    fun sayHello(name: String) = println("Hello $name")
    sayHello("Tony")

    val(two, three) = nextTwo(1)
    println("1 $two $three")

    println("Sum = ${getSum(1,2,3,4,5)}")

    var multiply = {num1 : Int, num2: Int -> num1 * num2}
    println("5 * 3 = ${multiply(5, 3)}")

    println("5! = ${fact(5)}")
}

fun nextTwo(num: Int) : Pair<Int, Int>{
    return Pair(num+1, num+2)
}

fun getSum(vararg nums: Int) : Int{
    var sum = 0
    nums.forEach { n -> sum += n }
    return sum
}

fun fact(x: Int): Int{
    tailrec fun factTail(y: Int, z: Int): Int{
        if (y==0) return z
        else return factTail(y-1, y*z)
    }
    return factTail(x, 1)
}