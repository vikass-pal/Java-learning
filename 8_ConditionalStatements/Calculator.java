import java.util.*;
public class Calculator {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt(); 
        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+': System.out.println(a + b);
            break;
            case '-': System.out.println(a - b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("Sorry! cant do this calculation");
        }
    }
}
