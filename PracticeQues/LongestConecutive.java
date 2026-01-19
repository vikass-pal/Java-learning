import java.util.HashSet;

public class LongestConecutive {

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
// 128. Longest Consecutive Sequence
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
// Example 3:

// Input: nums = [1,0,1,2]
// Output: 3
