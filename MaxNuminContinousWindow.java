import java.util.*;

public class MaxNuminContinousWindow {

    public static void main(String[] args) {

        int[] arr = inputArray();

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] result = max(arr, k);

        for(int num : result){
            System.out.print(num + " ");
        }
    }

    public static int[] max(int[] arrr, int k){

        int[] maximum = new int[arrr.length - k + 1];

        for(int i = 0; i <= arrr.length - k; i++){

            int max = arrr[i];

            for(int j = i; j < i + k; j++){
                if(arrr[j] > max){
                    max = arrr[j];
                }
            }

            maximum[i] = max;
        }

        return maximum;
    }

    public static int[] inputArray(){

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.replaceAll("[\\[\\],]"," ");

        Scanner ss = new Scanner(input);

        while(ss.hasNextInt()){
            arr.add(ss.nextInt());
        }

        int[] nums = new int[arr.size()];

        for(int i=0;i<arr.size();i++){
            nums[i] = arr.get(i);
        }

        return nums;
    }
}