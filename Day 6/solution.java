import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=0 ; i<N ; i++) {
            String s = scan.next();
            String even = "", odd = "";
            for(int j=0 ; j < s.length() ; j++) {
                if(j%2==0) {
                    even += s.charAt(j);
                } else {
                    odd += s.charAt(j);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
