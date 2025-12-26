import java.util.HashMap;

public class SumofUnique {
    class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                if(map.get(nums[i]) == 1) {
                    sum+=nums[i];
                }
            }
        }
        return sum;
    }
}
}
