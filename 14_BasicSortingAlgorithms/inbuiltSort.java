import java.util.Arrays;
import java.util.Collections;

/**
 * This class demonstrates the use of the inbuilt sort function in Java.
 */
// public class inbuiltSort {
//      public static void printArr(int arr[]) {
//         for(int i=0;i<arr.length;i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         }
//     public static void main(String[] args) {
//         int[] arr = {5, 4, 1, 3, 2, 8};
//         Arrays.sort(arr,0,3); // Using inbuilt sort function
//         printArr(arr); // Printing the sorted array
//     }
// }

public class inbuiltSort {
     public static void printArr(Integer arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }
    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2, 8};
        Arrays.sort(arr,0,4, Collections.reverseOrder()); // Using inbuilt sort function
        printArr(arr); // Printing the sorted array
    }
}
