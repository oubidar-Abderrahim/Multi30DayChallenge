import java.util.Scanner

fun main(args: Array<String>) {

    val i = 4
    val d = 4.0
    val s = "HackerRank "
    // Read values of another integer, double, and string variables
    val reader = Scanner(System.`in`)
    
    val i2 = reader.nextInt()
    val d2 = reader.nextDouble()
    reader.nextLine()
    val s2 = reader.nextLine()
    // Print the sum of both the integer variables
    println(i+i2)
    // Print the sum of both the double variables
    println(d+d2)
    // Concatenate and print the string variables
    // The 's' variable above should be printed first.
    println(s+s2)

}
