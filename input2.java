import java.util.*;
public class input2 {
    public static void main(String[] args) {
        System.out.println("This is input2.java file.");
        ArrayList<Integer> arr = inputt2();
       
       int[] nums = new int[arr.size()];
       for(int i=0;i<arr.size();i++) {
              nums[i] = arr.get(i);
       }
      int result =  findMajority(nums);
      System.out.println(result);
      
    }
    public static ArrayList<Integer> inputt2() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Scanner ss = new Scanner(input);
        while(ss.hasNextInt()) {
            arr.add(ss.nextInt());
        }
        return arr;
    }
    public static int findMajority(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
            } else {
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(map.get(nums[i]) > nums.length/2) {
                // System.out.println(nums[i]+ "is maximum occuring element");
                return nums[i];
            }
        }
        return -1;
    }
        
}
