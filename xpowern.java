public class xpowern {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1; // Base case: x^0 = 1
        }
      int xn1 =   power(x, n-1);
      int xn2 = x* xn1;
      return xn2;
    //   or we can write it as:
    //   return x * power(x, n - 1);
    }
    public static void main(String[] args) {
        int x = 2; // Base
        int n = 10; // Exponent
        int result = power(x, n);
        System.out.println("Result: " + result);
    }
}
