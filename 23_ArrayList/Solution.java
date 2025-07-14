class Solution {
    public static boolean checkSubarraySum(int[] nums, int k) {
        for(int i=0;i<nums.length;i++) {
            for(int j = i+1;j<nums.length;j++) {
                int count = nums[i] + nums[j];
                
                if( count == k) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {23,2,4,6,7};
        int k = 13;
      System.out.println(checkSubarraySum(nums,k));  
    }
}