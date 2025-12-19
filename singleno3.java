import java.util.HashMap;

public class singleno3 {
    
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int value = nums[i];
            map.put(value,map.getOrDefault(value,0) + 1);
        }
        int[] result = new int[2];
        int idx = 0;
        for(int i=0;i<nums.length;i++) {
            int value = nums[i];
            if(map.get(value) == 1) {
                result[idx++] = value;
                if(idx == 2) {
                    break;
                }
            }
        }
        return result;
    }
}
