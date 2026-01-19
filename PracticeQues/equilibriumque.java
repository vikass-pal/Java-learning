import java.util.*;
public class equilibriumque{
    public static void main(String[] args) {
        int[] nums = input();
        int index = equilibrium(nums);
        if(index == -1) {
            System.out.println("No index found");
        } else {
            System.out.println("Index is"+ index);
        }
    }
    public static int[] input() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[","").replace("]","");
        String[] parts = input.split("[,\\s]+");
        for(String s:parts) {
            if(!s.isEmpty()) {
                arr.add(Integer.parseInt(s));
            }
        }
        int[] numms = new int[arr.size()];
        for(int i=0;i<arr.size();i++) {
            numms[i] = arr.get(i);
        }
        return numms;
    }
    public static int equilibrium(int[] ar) {
        int totalSum = 0;
        for(int i=0;i<ar.length;i++) {
            totalSum+=ar[i];
        }
        int left = 0;
        for(int i=0;i<ar.length;i++) {
            int right = totalSum-left-ar[i];
            if(left == right) {
                return i;
            }
            left+=ar[i];
        }
        return -1;
    }
}