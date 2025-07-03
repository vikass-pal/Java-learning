public class Solutions {
    public static void  sortArray(int arr[]) {
            for(int i=0;i<arr.length;i++) {
                int curr = arr[i];
                int prev = i-1;
                while(prev >= 0 && arr[prev] > curr) {
                    arr[prev + 1] = arr[prev];
                    prev --;

                    
                } 
                 arr[prev + 1] = curr;
                
            }
    }
    public static void printarr(int arr[]) {
            for(int i=0;i<arr.length;i++) {
                System.out.println("arr =" + arr[i]);
            }
        }

    public static void main(String args []) {
        int arr[] = {5,2,3,1};
        // Solution q = new Solution();
        Solutions q = new Solutions();
        sortArray(arr);
        printarr(arr);
    }
} 
