class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftmost = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightmost = totalSum - leftmost - nums[i];
            if (leftmost == rightmost) {
                return i;
            }
            leftmost += nums[i];
        }
        return -1;
    }
}