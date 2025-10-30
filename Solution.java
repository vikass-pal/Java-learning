import java.util.HashSet;

public class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        long currSum = 0;
        long maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            while (set.contains(nums[i]) || set.size() == k) {
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            currSum += nums[i];
            set.add(nums[i]);
            if (set.size() == k) {
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }
} 
