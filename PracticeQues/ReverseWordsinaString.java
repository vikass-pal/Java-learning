class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int i = n - 1;

        while (i >= 0) {
            // skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;

            int j = i;
            // find the start of the word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            
            // extract the word [i+1 .. j]
            if (sb.length() > 0) sb.append(" ");
            sb.append(s.substring(i + 1, j + 1));
        }

        return sb.toString();
    }
}
