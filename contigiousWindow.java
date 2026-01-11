import java.util.*;
public class contigiousWindow{
    public static void main(String[] args) {
        int[] nums = input();
        ArrayList<Integer> arrr = contigious(nums,2);
        System.out.println(arrr);

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
    int[] nums = new int[list.size()];
    for(int i=0;i<list.size();i++) {
        nums[i] = list.get(i);
    }
    return nums;
    }
    public static ArrayList<Integer> contigious(int[] arr,int k) {
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i=0;i<=arr.length-k;i++) {
            int max = arr[i];
            max = Math.max(max,arr[i]);
            for(int j=i;j<i+k;j++) {
                max = Math.max(max,arr[j]);
            }
             array.add(max);
        }
        return array;

    }
}