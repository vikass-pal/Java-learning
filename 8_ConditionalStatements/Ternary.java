
import java.util.*;
public class Ternary {
    public static void main (String args[]) {
        // int number = 4;

        // // ternary operator
        // String num = ((number %2) == 0) ? "EvEn" : "Odd";
        // System.out.println(num);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int marks = sc.nextInt();
        String result = (marks >=33) ? "Pass": "Fail";
        System.out.println(result);
    }
}
