import java.util.*;
public class Input1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = inputArray1();
        System.out.println(nums);
        int[] arr = new int[nums.size()];
        for(int i=0;i<nums.size();i++) {
            arr[i] = nums.get(i);

        }
        
        int[] res = twoSum(arr, 5);
        System.out.println(Arrays.toString(res));

    }
    public static ArrayList<Integer> inputArray1(){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(char c: input.toCharArray()) {
            if(Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                arr.add(num);
            }
        }
        return arr;
    }
    public static int[] twoSum(int[] arr,int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int rem = target - arr[i];
            if(map.containsKey(rem)) {
                return new int[] {map.get(rem),i};

            } else {
                map.put(arr[i],i);
            }
        }
        return new int[]{-1, -1};

    }
}
