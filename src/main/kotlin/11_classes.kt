import kotlin.math.PI

class Earth{
    val diameter = 12756
    val distanceToSun = 149.6e6
    val mass = 5.9724e24
}

class Planet(
    val diameter: Int,
    val distanceToSun: Double,
    val mass: Double
) {
    private var circumference: Double
    init {
        circumference = PI * diameter
        println(circumference)
    }
}


fun main() {
    val earth = Planet(diameter = 12756, distanceToSun = 149.6e6, mass = 5.9724e24)

    println(earth.diameter)
    println(earth.distanceToSun)
    println(earth.mass)
    val javaEarth = JavaEarth()
    println(javaEarth.diameter)
    println(javaEarth.distanceToSun)
    println(javaEarth.mass)
}