// public class Continue {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++) {
//             if(i==3) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
    
// }
import java.util.*;
public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        do{
            System.out.println("Enter a number");
            int n = sc.nextInt();

            if(n%10 == 0) {
                continue;
            }
            System.out.println(n);
        } while(true);
        // System.out.println();
    }
    
}

