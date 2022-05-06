//https://youtu.be/H_oGi8uuDpA

fun main(args: Array<String>) {
    println("Hello, World!")

    val firstName = "Tony"
    val lastName  = "Stark"
    var age = 42

    val bigInt: Int = Int.MAX_VALUE
    val smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: " + bigInt)
    println("Smallest Int: $smallInt")


    val fullName = firstName + " " + lastName

    println(fullName)
    println("Name: $fullName")
    println("String length: ${fullName.length}")

    val str1 = "A random string"
    val str2 = "a random string"

    println("String Equals: ${str1.equals(str2)}")

    println("2nd Index: ${str1[2]}")
}