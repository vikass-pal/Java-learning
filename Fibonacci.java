public class Fibonacci {
    public static int fib(int n) {
        if(n == 0 || n==1) {
            return n;
        }
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fib3 = fib1 + fib2;
        return fib3;
    }
    public static void main(String[] args) {
        int n = 25; // Example input
        // int result = fib(n);
        System.out.println(fib(n));
    }
}
