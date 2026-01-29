public class nextGreaterElement3 {
    class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        if(!permutation(digits)) return -1;
        long res = 0;
        for (char c : digits) {
            res = res * 10 + (c - '0');
        }
        return res > Integer.MAX_VALUE ? -1 : (int) res;
    }

    public boolean permutation(char[] digits) {
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i+1]) {
            i--;
        }
        int j = digits.length - 1;
        if (i < 0)
            return false;
        while (j >= 0 && digits[j] <= digits[i])
            j--;
        swap(digits, i, j);
        reverse(digits, i + 1, digits.length - 1);
        return true;
    }

    public void swap(char[] nums, int a, int b) {
        char temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(char[] arr, int c, int d) {
        while (c < d) {
            swap(arr, c, d);
            c++;
            d--;
        }
    }
}
}

// 556. Next Greater Element III
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.

// Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

 

// Example 1:

// Input: n = 12
// Output: 21
// Example 2:

// Input: n = 21
// Output: -1
 

// Constraints:

// 1 <= n <= 231 - 1


