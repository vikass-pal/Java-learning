import java.util.Arrays;
import java.util.HashSet;

public class secondHighest {
    class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                set.add(ch - '0');
            }
        }
        if (set.size() < 2)
            return -1;
        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
}
}
