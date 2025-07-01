class Question2 {
    public int[] sortArray(int arr[]) {
            int end = arr.length-1;
         for(int i=0; i<end;i++) {
            for(int j = 0;j<end-i;j++) {
               if(arr[j] >arr[j+1]) {
                 int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               }
            }
        }
        return arr;
        
    }
    public static void printarr(int arr[]) {
            for(int i=0;i<arr.length;i++) {
                System.out.println("arr =" + arr[i]);
            }
        }

    public static void main(String args []) {
        int arr[] = {5,2,3,1};
        Question2 q = new Question2();
        q.sortArray(arr);
        printarr(arr);


    }
}