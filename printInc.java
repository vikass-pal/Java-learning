public class printInc {
    public static void printIncrease(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return ;
        }
        printIncrease(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printIncrease(n);
    }
}
