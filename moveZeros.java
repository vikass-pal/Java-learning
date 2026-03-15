import java.util.*;
public class moveZeros{
    public static void main(String[] args) {
        int[] arr = inputArray();
        int[] result = moveZero(arr);
        for(int i=0;i<result.length;i++) {
            System.out.print(" " + result[i]);
        }
    }

    public static int[] moveZero(int[] nums) {
        int start = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start]= temp; 
                start++;

            }
        }
        return nums;
    }

    public static int[] inputArray() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replaceAll("[\\[\\],]"," ");
        Scanner ss = new Scanner(input);
        while(ss.hasNextInt()) {
            list.add(ss.nextInt());
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}