public class isSortedarray {
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1){
            return true; // Base case: if we reach the last element, the array is sorted
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i + 1);
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 4, 5}; // Example input
       System.out.println(isSorted(arr, 0));
    }
}
