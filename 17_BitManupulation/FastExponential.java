public class FastExponential {
    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n>0) {
            if((n & 1) != 0) { // If n is odd
                ans = ans * a; // Multiply the current answer by a
               
            }
             a = a * a; // Square the base
             n = n>>1;
             }
        return ans;
    }
    public static void main(String[] args) {
       System.out.println(fastExpo(3, 5)); // Should return 1024
    }
}
