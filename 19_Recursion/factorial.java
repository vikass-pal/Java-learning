public class factorial {
    
    public static int fact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int fact1 = fact(n-1);
        int fn = n * fact1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
