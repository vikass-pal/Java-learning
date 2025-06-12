 import static java.lang.Math.*;
 public class primeornotOptimized {

    public static boolean isPrime(int n) {
       

        if(n == 2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                 return false;
              
            }


        }
        return true;
    }
    
    public static void main(String[] args) {
        // isPrime(4);
        System.out.println(isPrime(9));
    }
}
 