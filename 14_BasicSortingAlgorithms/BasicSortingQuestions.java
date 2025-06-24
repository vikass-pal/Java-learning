public class BasicSortingQuestions {
    //1 bubble sort

    // public static void bubbleque(int arr[]) {
    //     for(int i=0;i<arr.length-1;i++) {
    //         for(int j=0;j<arr.length-1-i;j++){
    //             if(arr[j] < arr[j+1]) {

    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    //2. selection sort

    // public static void selectionque(int arr[]) {
    //     for(int i=0;i<arr.length-1;i++) {
    //         int min = i;
    //         for( int j = i+1;j<arr.length;j++) {
    //             if(arr[j] > arr[min]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[min];
    //                 arr[min] = temp;
    //             }
    //         }
    //     }
    // }

    //3 insertion sort

    public static void insertionque(int arr[]) {
        for(int i = 1; i<arr.length;i++){
            int curr= i;
            int prev = i-1;
            while(prev >=0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                arr[prev] = arr[prev];
                prev--;
 
            }
            arr[prev+1] = curr;
        }
    }


     public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }

        public static void main(String[] args) {
        int[] arr = {6,3,5,2,4,1};
        insertionque(arr);
        printArr(arr);
        }
}
