public class RecursionQuestions {
    public static int occ(int arr[], int key,int i) {
        if(i == arr.length) {
            return 0;
        }
        // int count = 0;

        if(arr[i] == key) {
            // count = count +1;
            System.out.println(i + "");
        }
        return occ(arr, key, i + 1);
         
    }
    public static void main(String[] args) {
          int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,5, 10};
        int key = 5; // Example target value
       occ(arr, key, 0);
        // System.out.println(firstOcc(arr, key, 0));
        System.out.println();
    }
}
