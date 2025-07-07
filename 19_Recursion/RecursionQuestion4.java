import java.util.Arrays;
import java.util.*;
// import java.util.s
public class RecursionQuestion4 {
    public static int printSubarray(String str, int i, int j, int n) {
        if (i > j) {
            return 0;
        }
         if(n <= 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
       

      int res =  printSubarray(str, i+1, j, n-1) + printSubarray(str, i, j-1, n-1) -
        printSubarray(str, i+1, j+1, n-2);

        if(str.charAt(i) == str.charAt(j)) {
            res++;
            
        }
       return res;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
      System.out.print(printSubarray(str, 0, n-1, n));

        
    }
}
