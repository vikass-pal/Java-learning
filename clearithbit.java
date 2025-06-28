public class clearithbit {
    public static int clearIthbit(int n, int i) {
        int bitMask = 1<<i;
        return n & ~(bitMask); // Clear the ith bit to 0
    }
    public static void main(String[] args) {
        System.out.println(clearIthbit(10, 1)); // Example usage
    }
}
