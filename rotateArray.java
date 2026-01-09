import java.util.*;
public class rotateArray {
    public static void main(String[] args) {
        int[] nums = input();
       reverse(nums,3);
        // System.out.println(arrr);
        System.out.println(Arrays.toString(nums));
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
        // return arr;
        int[] arr1 = new int[arr.size()];
        for(int i=0;i<arr.size();i++) {
            arr1[i] = arr.get(i);
        }
        return arr1;
    }
    public static void reverse(int[] array,int k) {
        int n = array.length;
        k = k%n;
        rotate(array,0,n-1);
        rotate(array,0,k-1);
        rotate(array,k,n-1);
    }
    public static void rotate(int[] ar,int left,int right) {
        while(left<right) {
            int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;
            right--;
            left++;
        }
    }

}
