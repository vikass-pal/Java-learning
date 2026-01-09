import java.util.*;
public class rearrange {
    public static void main(String[] args) {
        ArrayList<Integer> arr = input();
        for(int i=0;i<arr.size();i++) {
            for(int j=0;j<arr.size();j++) {
                if(arr.get(i)<arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        System.out.println(arr);
    }
    public static ArrayList<Integer> input() {
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
        return nums;
    }
}