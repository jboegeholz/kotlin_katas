import java.io.File

fun main(args: Array<String>) {
    val file = File("./data/data.txt")
    val contents = file.readText()
    val lines = contents.lines()
    // printing lines
    val values = ArrayList<Int>(0)
    lines.forEach {
        val value = it.split(":").toTypedArray()[1].trim().toInt()
        println(value)
        values.add(value)
    }
    values.sort()
    println(values)
    var median = 0
    if (values.size % 2 != 0) {
        median = values[values.size/2]
        println("Median is $median")
    } else {
        median = (values[values.size/2] + values[((values.size)/2)+1]) / 2
        println("Median is $median")
    }

}