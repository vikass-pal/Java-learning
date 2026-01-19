import java.util.*;
public class leftEqualRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }

        int totalSum = 0;
        for(int i=0;i<n;i++) {
            totalSum +=nums[i];
        }
        boolean possible = false;
        int left = 0;
        int sum = totalSum/2;
        for(int i=0;i<n;i++) {
            int right = totalSum - left -nums[i];
            if(left == right) {
                possible = true;
                break;
            } 
            left+=nums[i];
        }
        if(possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


