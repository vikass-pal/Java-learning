import java.util.*;
public class BreakQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Kindly enter a number");
            int n = sc.nextInt();
            
            if(n%10 == 0) {
                break;
            }
            System.out.println(n);

        }
        while(true);
    }
}
