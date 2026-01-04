public class gcd {
    public static void main(String[] args) {
        int a = 20;
        int b = 28;

        System.out.println(gcd(a, b));
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
