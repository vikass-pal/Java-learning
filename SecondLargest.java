import java.util.Arrays;

public class SecondLargest {
  
    public int getSecondLargest(int[] arr) {
        
        // code here
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i] != arr[i-1] ) {
                return arr[i-1];
            } 
        }
        return -1;
    }
}

