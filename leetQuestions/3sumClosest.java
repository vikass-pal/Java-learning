public class 3sumClosest {
   
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int bestSum = 0;
        for(int i=0;i<nums.length-2;i++) {
            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if(diff < closest) {
                    closest = diff;
                     bestSum = sum;
                } 
                if(sum < target) {
                    left++;
                } else if(sum > target){
                    right--;
                } else{return sum;
                } 
            }
        }
        return bestSum;
    }

}
