class Solution {
    public boolean checkZeroOnes(String s) {
        char[] nums = s.toCharArray();
        int count0 = 0;
        int count1 = 0;
        int max1 = 0;
        int max0 = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == '1') {
                count1++;
                count0 = 0;
                max1 = Math.max(max1,count1);
            } else {
                count0++;
                count1 = 0;
                max0 = Math.max(max0,count0);
            }
        }
        if(max1>max0) {
            return true;
        }
        return false;
    }
}