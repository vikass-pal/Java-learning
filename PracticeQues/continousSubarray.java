import java.util.*;
public class continousSubarray{
    public static void main(String[] args) {
        int[] arr = input();
        int countt = continous(arr,3);
        System.out.println("count is "+ countt);
    }
    public static int[] input() {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[","").replace("]","");
        String[] parts = input.split("[,\\s]+");
        for(String s:parts) {
            if(!s.isEmpty()) {
                nums.add(Integer.parseInt(s));
            }
        }
        int[] ar = new int[nums.size()];
        for(int i=0;i<nums.size();i++) {
            ar[i] = nums.get(i);
        }
        return ar;
    }
    public static int continous(int[] arrr,int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix = 0;
        for(int i=0;i<arrr.length;i++) {
            prefix +=arrr[i];
            if(map.containsKey(prefix-k)) {
                count+=map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}