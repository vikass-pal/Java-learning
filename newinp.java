import java.util.*;

public class newinp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s1 = s1.replaceAll("\\", "").toLowerCase();
        s2 = s2.replaceAll("\\", "").toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("not Anagram");
        }
    }
}