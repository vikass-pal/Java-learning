import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IndexOfAnagram {
    class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch1 = s.charAt(right);
            map2.put(ch1, map2.getOrDefault(ch1, 0) + 1);
            if (right - left + 1 > p.length()) {
                char leftChar = s.charAt(left);
                map2.put(leftChar, map2.get(leftChar) - 1);
                if (map2.get(leftChar) == 0) {
                    map2.remove(leftChar);
                }
                left++;
            }
            if (map2.equals(map1) && right - left + 1 == p.length()) {
                result.add(left);
            }
        }
        return result;
    }
}
}
