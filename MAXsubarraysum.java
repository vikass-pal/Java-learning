public class MAXsubarraysum {
    
    public static void printSubarray(int numbers[] ){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++) {
            int start = i;
            
            for(int j =i; j<numbers.length;j++) {
                int last = j;
                currSum= 0;
                for(int k=start; k<=last;k++) {
                    currSum = currSum + numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum; 
                }
            }
            // System.out.println("Subarray starting at index " + start + ":");
        
        }
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,3,5,6,7,8};
        printSubarray(numbers);
       
    }
}
