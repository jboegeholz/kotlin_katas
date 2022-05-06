import java.nio.file.Paths

fun main() {
    val cwd = Paths.get("").toAbsolutePath().toString()
    println(cwd)
}
