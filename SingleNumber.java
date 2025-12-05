import java.util.HashMap;

public class SingleNumber {
   
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int value = nums[i];
            map.put(value,map.getOrDefault(value,0)+1);
        }
        for(int i=0;i<nums.length;i++) {
             int value = nums[i];
             if(map.get(value) == 1) {
                return value;
             }
        }
        return -1;
    }
}

