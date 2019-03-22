import java.io._
import java.math._
import java.util._

object Solution {

    // Complete the solve function below.
    def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {

        val price100: Double = meal_cost * ( 100.0 + tip_percent + tax_percent );
        println( Math.round( price100 / 100.0 ) );
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val meal_cost = stdin.readLine.trim.toDouble

        val tip_percent = stdin.readLine.trim.toInt

        val tax_percent = stdin.readLine.trim.toInt

        solve(meal_cost, tip_percent, tax_percent)
    }
}
