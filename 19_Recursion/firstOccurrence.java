public class firstOccurrence {
    public static int firstOcc(int arr[], int key , int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,5, 10};
        int key = 5; // Example target value
        System.out.println(firstOcc(arr, key, 0));

    }
}
