public class lastOccurrence {
    public static int lastOcc(int arr[], int key, int i) {
       if(i == arr.length) {
        return -1;
       }
        int isFound = lastOcc(arr, key, i + 1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,5, 10};
        int key = 5; // Example target value
        System.out.println(lastOcc(arr, key, 0));
    }
}
