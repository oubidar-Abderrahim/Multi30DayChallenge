object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val N = scala.io.StdIn.readInt()
        for(i <- 0 to N-1){
            var S: String = scala.io.StdIn.readLine()
            var even: String = ""
            var odd: String = "";
            for(j <- 0 to S.length()-1) {
                if(j%2==0) {
                    even += S(j);
                } else {
                    odd += S(j);
                }
            }
            System.out.println(even + " " + odd);
        }    
    }
}
