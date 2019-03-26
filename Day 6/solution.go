package main
import (
  "fmt"
  "os"
  "bufio"
  "strconv"
)

func main() {
    //Enter your code here. Read input from STDIN. Print output to STDOUT
    scanner := bufio.NewScanner(os.Stdin)
    var N uint64
    if(scanner.Scan()) {
        inr, _ := strconv.ParseUint(scanner.Text(), 10, 64)
        N = inr
        var S string
        for i := 0; uint64(i) < N; i++ {
            var even = ""
            var odd = ""
            if(scanner.Scan()) {
                str := scanner.Text()
                S = str
                for j := 0; j < len(S); j++ {
                    if(j%2==0) {
                        even += string(S[j])
                    } else {
                        odd += string(S[j])
                    }
                }
                fmt.Println(even,odd)
            }
        }
    }
}
