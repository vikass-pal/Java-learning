public class tilingproblem {
    public static int tile(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fnm1 = tile(n-1);

        // horizontal choice
        int fnm2 = tile(n-2);

        // total ways
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
        public static void main(String[] args) {
        System.out.println(tile(3)); // Example: 4 tiles 
    }
}
