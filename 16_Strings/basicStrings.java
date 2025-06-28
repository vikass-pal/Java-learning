import java.util.*;
public class basicStrings {
    public static void printletters(String str) {
        for(int i = 0; i<str.length();i++) {
            System.out.println(str.charAt(i));
        }
            System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(2));

        String first = " vikas";
        String last = " pal";
        String full = first + last;
        System.out.println(full);
    }
}
