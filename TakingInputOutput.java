// for normal Array
import java.util.*;
public class TakingInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            // arr.add(arr[i]);
        }
        for( int a: arr) {
            System.out.print(a + " ");
        }
        sc.close();
    }
}

// if size of array is not given like user can give any number of inputs
// import java.util.*;
// public class Stringtoarr{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//     String input = sc.nextLine();
//     String ch[] = input.split(" ");
//     int arr[] = new int[ch.length];
//     ArrayList<Integer> arr = new ArrayList<>();
//     for(String token : ch) {
//         int num = Integer.parseInt(ch);
//         arr[i] = num;
//         arr.add(num);
//     }
//     sc.close();
//     }
    
// }