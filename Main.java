import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<String, Character> digitParserMap = new HashMap<>();
    private static final Map<Character, Character> bestToggleMap = new HashMap<>();

    static {
        digitParserMap.put(" _ | ||_|", '0');
        digitParserMap.put("   | |", '1');
        digitParserMap.put(" _  _||_ ", '2');
        digitParserMap.put(" _  _| _|", '3');
        digitParserMap.put("  |_| |", '4');
        digitParserMap.put(" _ |_  _|", '5');
        digitParserMap.put(" _ |_ |_|", '6');
        digitParserMap.put(" _   |  |", '7');
        digitParserMap.put(" _ |_||_|", '8');
        digitParserMap.put(" _ |_| _|", '9');

        bestToggleMap.put('8', '7');
        bestToggleMap.put('7', '1');
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String line2 = br.readLine();
        String line3 = br.readLine();
        int k = Integer.parseInt(br.readLine().trim());

        StringBuilder originalNumberBuilder = new StringBuilder();
        
        for (int i = 0; i <= line1.length() - 3; i += 4) {
            String l1_sub = line1.substring(i, i + 3);
            String l2_sub = line2.substring(i, i + 3);
            String l3_sub = line3.substring(i, i + 3);
            
            String key = l1_sub + l2_sub + l3_sub;
            
            if (digitParserMap.containsKey(key)) {
                originalNumberBuilder.append(digitParserMap.get(key));
            }
        }

        String originalString = originalNumberBuilder.toString();
        BigInteger originalNumber = new BigInteger(originalString);
        char[] modifiedChars = originalString.toCharArray();
        boolean[] positionToggled = new boolean[modifiedChars.length];

        for (int toggleNum = 0; toggleNum < k; toggleNum++) {
            int bestPosition = -1;
            char minReplacement = (char) ('9' + 1);

            for (int j = 0; j < modifiedChars.length; j++) {
                if (positionToggled[j]) {
                    continue;
                }

                char currentDigit = modifiedChars[j];
                if (bestToggleMap.containsKey(currentDigit)) {
                    char replacement = bestToggleMap.get(currentDigit);
                    
                    if (replacement < minReplacement) {
                        minReplacement = replacement;
                        bestPosition = j;
                    }
                }
            }

            if (bestPosition != -1) {
                modifiedChars[bestPosition] = minReplacement;
                positionToggled[bestPosition] = true;
            } else {
                break;
            }
        }

        String modifiedString = new String(modifiedChars);
        String nextAnagramString = findNextPermutation(modifiedString.toCharArray());
        BigInteger nextAnagramNumber = new BigInteger(nextAnagramString);
        
        System.out.println(nextAnagramNumber.subtract(originalNumber).abs());
    }

    private static String findNextPermutation(char[] arr) {
        int n = arr.length;
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }

        reverse(arr, i + 1);
        return new String(arr);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(char[] arr, int start) {
        int i = start, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}