public class primeornot {

    public static boolean isPrime(int n) {
        boolean isPrime = true;

        if(n == 2) {
            return true;
        }

        for(int i=2; i<=n-i; i++) {
            
            if(n % i == 0) {
                isPrime = false;
                break;
            }


        }
        return isPrime;
    }
    
    public static void main(String[] args) {
        // isPrime(4);
        System.out.println(isPrime(2));
    }
}
