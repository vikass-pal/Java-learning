public class optimizedpower {
    public static int  optimizedpowerr(int a, int n) {
        if(n == 0) {
            return 1;
        }
        int halfpower = optimizedpowerr(a,n/2);
         int halfpowersq = halfpower * halfpower;

         if(n % 2 != 0) {
          halfpowersq=   a * halfpowersq;
         }
         return halfpowersq;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        int result = optimizedpowerr(a, n);
        System.out.println("Result: " + result);
        
    }
}
