public class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int left = 0;
        int count = 0;
        for (int right = 0; right < s.length(); right++) {
            if (isVowel(s.charAt(right))) {
                count++;
            }
            if (right - left + 1 > k) {
                if (isVowel(s.charAt(left))) {
                    count--;
                }
                left++;
            }

            if (right - left + 1 == k) {
                max = Math.max(max, count);
            }
        }
        return max;
    }
    boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

} {
    
}
