public class Question {
    
    // Overloaded reverse method for subarray reversal
    public static void reverse(int arr[], int start, int last) {
        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }
      public static void rotate(int[] arr, int key) {
        int n = arr.length;
        key = key % n; // to handle key > n

        // Reverse the entire array
        reverse(arr, 0, n - 1);
        // Reverse the first 'key' elements
        reverse(arr, 0, key - 1);
        // Reverse the remaining elements
        reverse(arr, key, n - 1);
    }

    public static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 8};
        int key = 2;
        // reverse(arr, key);
        rotate(arr, key);
        System.out.println("Rotated array:");
        printArr(arr, arr.length);
    }
}
