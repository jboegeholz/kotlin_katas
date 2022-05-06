package demo

fun main(args: Array<String>) {
    var myArray = arrayOf(1, 1.23, "Jörn")
    println(myArray[2])
    println("First: ${myArray.first()}")
    println("Last: ${myArray.last()}")

    myArray[1] = 3.14

    println("Array length: ${myArray.size}")
    println("Jörn in array: ${myArray.contains("Jörn")}")

    var partArray = myArray.copyOfRange(0,1)
    println("First: ${partArray.first()}")
    // println("2nd Index: ${partArray[2]}") -> java.lang.ArrayIndexOutOfBoundsException: 2
    println("Index of Doug: ${myArray.indexOf("Doug")}") // returns -1 if not in array
    println(myArray.contentToString())

    var sqArray = Array(5, {x -> x * x})
    println(sqArray.contentToString())
    println(sqArray)

    var arr2: Array<Int> = arrayOf(1,2,3)
    println(arr2.contentToString())
}