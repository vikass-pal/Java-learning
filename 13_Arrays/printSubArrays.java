public class printSubArrays {

    public static void printSubarray(int numbers[] ){
        for(int i=0;i<numbers.length;i++) {
            int start = i;
            
            for(int j =i+1; j<numbers.length;j++) {
                int last = j;
                for(int k=start; k<last;k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            // System.out.println("Subarray starting at index " + start + ":");
        System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,3,5,6,7,8};
        printSubarray(numbers);
       
    }
}
