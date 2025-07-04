public class sum {
    public static int calcsum(int n) {
        if(n ==1) {
            return 1;
        }
       int sum1 = calcsum(n - 1);
       int sum2 = n + sum1;
       return sum2;
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = calcsum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
