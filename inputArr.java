import java.util.*;
public class inputArr {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String[] input = sc.nextLine().split(",");
        // int[] arr = new int[input.length];

        // for(int i=0;i<input.length;i++) {
        //     arr[i] = Integer.parseInt(input[i]);
        // }
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replaceAll("[\\[\\],]"," ");
        Scanner ss = new Scanner(input);
        ArrayList<Integer> list = new ArrayList<>();
        while(ss.hasNextInt()) {
            list.add(ss.nextInt());
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
             System.out.print( arr[i]+" ");
        }
       
    }
}
