import java.util.*;
public class FunctionWithParameter {

    public static int CalculateSum(int num1, int num2) {
        

        int sum = num1+num2;
       return sum;
    }
    public static void main(String[] args) {
        System.out.println("Kindely enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum =  CalculateSum( a,  b);
         System.out.println("Sum is " + sum);
    }
}
