import java.util.*;
public class maxSum {
    public static void main(String[] args) {
        int[] arr = input();
        int max = maxSubarray(arr);
        System.out.println(max);
    }
    public static int maxSubarray(int[] nums) {
        int max = 0;
        int currSum = 0;
        for(int i=0;i<nums.length;i++) {
            currSum +=nums[i];
            max = Math.max(currSum,max);
            if(currSum<0) {
                currSum = 0;
            }
        }
        return max;
    }
    public static int[] input() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[","").replace("]","");
        String[] parts = input.split("[,\\s]+");
        for(String s:parts) {
            if(!s.isEmpty()) {
                list.add(Integer.parseInt(s));
            }
        }
        int[] arrr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arrr[i] = list.get(i);
        }
        return arrr;
    }
}
