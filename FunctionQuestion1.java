import java.util.*;
public class FunctionQuestion1 {

    // Question1
    //  Write a Java method to compute the average of three numbers..

    // public static int Average(int a, int b, int c) {
    //     return (a + b + c) / 3;
    // }
    // public static void main(String[] args) {
    //     System.out.println(Average(2,4,6));
        
    // }


    // Question 2
//     Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method.

    // public static boolean isEven(int n) {
    //      boolean isEven = true;

    //      if(n%2 != 0) {
    //         isEven = false;
    //      }
    //      return isEven;
    // }

    // public static void main(String[] args) {
    //     System.out.println(isEven(2));
    // }

    // Question 3
        // Palindrome

        // public static boolean isPalindrome(int n) {
        //    boolean isPal = true;
        //     int orignal = n;
        //     int reverse = 0;

        //     while(n !=0) {
        //         reverse = reverse*10+n%10;
        //         n=n/10;
        //     }

        //     if(reverse != orignal) {
        //        isPal = false;
        //     }

        //     return isPal;

         

        // }

        // public static void main(String[] args) {
        //     System.out.println("Enter number");
        //    Scanner sc = new Scanner(System.in);
        //    int n = sc.nextInt();
           
        //    System.out.println(isPalindrome(n));

        // }

        // Question 4

        public static void sumDigit(int n) {
            int sum = 0;
            // int i = n;
          
            while(n > 0) {
                int  lastDigit = n%10;
                 sum = sum + lastDigit;

                 n= n/10;
            }
            System.out.println(sum);

        }

        public static void main(String[] args) {
            // System.out.println(sumDigit(123));
            sumDigit(123);
            // System.out.println(sumDigit(0););
        }
}
