import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class convertVowels {
    public static void main(String[] args) {

        List<Character> vowels =
                Arrays.asList('a','e','i','o','u','A','E','I','O','U');

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] s = input.toCharArray();

        for (int i = 0; i < s.length; i++) {
            if (vowels.contains(s[i])) {
                s[i] = Character.toUpperCase(s[i]); // ✅ correct
            }
        }

        String result = new String(s); // ✅ convert back
        System.out.println(result);
    }
}
