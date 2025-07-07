public class friendPairingproblem {
    public static int friendPair(int n) {
        if(n == 0 || n == 1) {
            return 1; // Base case: 0 or 1 friend can only be paired in one way
        }
        // choice
        // single
        int fnm1 = friendPair(n - 1);

        // pair
        int fnm2 = friendPair(n-2);
        int pairways = (n-1) * fnm2;

        // total ways
        int totalWays = pairways + fnm1;
        return totalWays;

        // short 
        // return friendPair(n - 1) + (n - 1) * friendPair(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(friendPair(3));
    }
}
