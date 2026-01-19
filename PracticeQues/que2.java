import java.util.*;
public class que2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = input();
        int maxSum = findSum(nums);
        System.out.println(maxSum);

    }
    public static ArrayList<Integer> input() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        input = input.replace(",", " ");
        Scanner ss = new Scanner(input);
        while(ss.hasNextInt()) {
            int num = ss.nextInt();
            arr.add(num);
        }
        return arr;
    }
    public static int findSum(ArrayList<Integer> nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        for(int i=0;i<nums.size();i++) {
            int a = nums.get(i);
            map.put(a,map.getOrDefault(a,0)+1);
        }
         for(int i=0;i<nums.size();i++) {
            int a = nums.get(i);
            if(map.get(a) == 1) {
                sum+=a;
            }
        }
        return sum;
    }
}
