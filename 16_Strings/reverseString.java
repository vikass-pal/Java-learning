import java.util.*;

public class reverseString {
    public static void reversestr(String str) {
        int first = 0;
        int last = str.length() - 1;
        char[] chars = str.toCharArray();
        while(first < last) {
            char temp = chars[first];
            chars[first] = chars[last];
            chars[last] = temp;
            first++;
            last--;
        }
        str = new String(chars);
        System.out.println(str);
    }
    public static void main(String[] args) {
         String str = "HELLOWORLD";
         reversestr(str);
    }
}
