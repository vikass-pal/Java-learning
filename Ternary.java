public class Ternary {
    public static void main (String args[]) {
        int number = 4;

        // ternary operator
        String num = ((number %2) == 0) ? "EvEn" : "Odd";
        System.out.println(num);
    }
}
