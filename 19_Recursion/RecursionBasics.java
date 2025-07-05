public class RecursionBasics {
    public static void printDecrease(int n) {
        if(n == 0) {
            return ;
        }
        System.out.println(n + "");
        printDecrease(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDecrease(n);
    }
}
