public class clearibits {
    public static int clearIbits(int n, int i) {
        int BitMask = ~(0) << i;
        return n & BitMask; // Clear the ith bit to 0
    }
    public static void main(String[] args) {
        System.out.println(clearIbits(15, 2)); // Example usage`
    }
}
