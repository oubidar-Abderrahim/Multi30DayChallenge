import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val i = 4
    val d = 4.0
    val s = "HackerRank "
    // Read values of another integer, double, and string variables
    val i2 = readLine()!!.toInt()
    val d2 = readLine()!!.toDouble()
    val s2 = readLine()
    // Print the sum of both the integer variables
    println(i+i2)
    // Print the sum of both the double variables
    println(d+d2)
    // Concatenate and print the string variables
    // The 's' variable above should be printed first.
    println(s+s2)
}
