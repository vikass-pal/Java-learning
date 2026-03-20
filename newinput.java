import java.util.*;
public class newinput {
    public static void main(String[] args) {
        int[] input = inputt();
        ArrayList<Integer> res = freq(input);
        for(int i=0;i<res.size();i++) {
            System.out.print(res.get(i) + " ");
        }
    }

    public static int[] inputt() {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
         for(int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i].trim());
        }

        return arr;
    }
    public static ArrayList<Integer> freq(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys,(a,b) -> {
            if(map.get(b) != map.get(a)) return map.get(b) - map.get(a);

            return a-b;
        });

        ArrayList<Integer> result = new ArrayList<>();
        for(int key : keys) {
            int freq = map.get(key);
            for(int i = 0;i<freq;i++) {
                result.add(key);
            }
        }
        return result;
    }
}
