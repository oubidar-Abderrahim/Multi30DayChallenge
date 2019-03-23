import java.io._
import java.util._

object Solution {

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn
        val N = stdin.readLine.trim.toInt
        // declaring res then assign somthing to it in the if doesn't work
        val res = if(N % 2 == 1 || (N > 5 && N < 21)) {
            "Weird"
        } else {
            "Not Weird"
        }
        println(res)
    }
}
