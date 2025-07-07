public class RecursionQuestion2 {
   static  String digits[] = {"zero", "one", "two", "three", "four", "five", 
                       "six", "seven", "eight", "nine", "ten"};
                       public static void printdigit(int n) {
                        if(n == 0) {
                            return ;

                        }
                        int lastDigit = n%10;
                        printdigit(n/10);
                        System.out.println(digits[lastDigit] + " ");
                       }
    public static void main(String[] args) {
        printdigit(213);
        
    }
}
