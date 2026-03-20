public class prac {
   public static void main(String[] args) {
    //  int a = 36;
    // int b=60;
    // while(b!=0) {
    //     int temp = b;
    //     b=a%b;
    //     a = temp;
    // }
    int n = 123;
    int rev = 0;
    while(n!=0) {
        int digit = n%10;
        rev = rev*10 + digit;
        n = n/10;
    }
    System.out.print(rev);
   }
}
