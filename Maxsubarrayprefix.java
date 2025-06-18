public class Maxsubarrayprefix {
    
    public static void subarrayprefix(int numbers[] ){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        // calculate prefix array
        for(int i=1; i<prefix.length;i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0;i<numbers.length;i++) {
            int start = i;
            
            for(int j =i; j<numbers.length;j++) {
                int last = j;
                currSum= start == 0 ? prefix[last] : prefix[last] - prefix[start - 1];
                
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
        subarrayprefix(numbers);
       
    }


}
