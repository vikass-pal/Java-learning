import java.util.*;

public class que {
    public static void main(String[] args) {
        ArrayList<Integer> arr = inputArray();
        int[] nums = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }
        ArrayList<String> result = threeFive(nums);
        System.out.println(result);
    }

    public static ArrayList<Integer> inputArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Scanner ss = new Scanner(input);
        while (ss.hasNextInt()) {
            arr.add(ss.nextInt());
        }
        return arr;
    }

    public static ArrayList<String> threeFive(int[] array) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] % 5 == 0) {
                result.add("ThreeFive");
            } else if (array[i] % 3 == 0) {
                result.add("Three");
            } else if (array[i] % 5 == 0) {
                result.add("Five");
            } else {
                result.add(Integer.toString(array[i]));
            }
        }
        // System.out.println(result);
        return result;

    }
}
