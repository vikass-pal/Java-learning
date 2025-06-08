import java.util.*;
public class print1ton {
    public static void main (String args[]) {
        System.out.println("Enter range");
        Scanner sc = new Scanner(System.in);
            int range = sc.nextInt();
            int count = 1;

            while(count <= range) {
                System.out.println(count + "");
                count++;
            }
            System.out.println();
        }
    }

