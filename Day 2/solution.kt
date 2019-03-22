import java.io.*
import java.math.*
import java.util.*


// Complete the solve function below.
fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {

    val price100: Double = meal_cost * ( 100.0 + tip_percent + tax_percent );
    println( Math.round( price100 / 100.0 ) );
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val meal_cost = scan.nextLine().trim().toDouble()

    val tip_percent = scan.nextLine().trim().toInt()

    val tax_percent = scan.nextLine().trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}
