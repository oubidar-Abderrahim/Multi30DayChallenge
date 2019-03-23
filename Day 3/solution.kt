import java.util.*
import kotlin.io.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt()

    if(N % 2 == 1 || (N > 5 && N < 21)) {
        println("Weird")
    } else {
        println("Not Weird")
    }
}
