public class RecursionQuestion3 {
    public static int printLength(String str) {
        if(str.length() == 0) {
            return 0;
        }

        return printLength(str.substring(1)) + 1;

    }
    public static void main(String[] args) {
        String str = "abc";
      System.out.println(  printLength(str));
        // Output: 3
        // Explanation: The length of the string "abc" is 3.
        
    }
}
