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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        pivotIndex(arr);
    }
}