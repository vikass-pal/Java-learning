import java.util.Arrays;

public class twoSum {
    
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i]; //to store value
            arr[i][1] = i; //to store index
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int sum = arr[start][0] + arr[end][0];
            if (sum == target) {
                return new int[] { arr[start][1], arr[end][1] };
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {};
    }
}
