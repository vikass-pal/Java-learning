import java.util.HashSet;

public class LongestConecutive {
    class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int maxCount = 0;
        if (nums.length == 0)
            return 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int n : set) {
            // int n = nums[i];
            if (!set.contains(n - 1)) {
                int num = n;
                count = 1;
                while (set.contains(n + 1)) {
                    count++;
                    n++;

                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
}
