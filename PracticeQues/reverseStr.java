import java.util.*;
public class reverseStr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // int[] arr = line.toCharArray();
        String rev = "";
        for(char c:line.toCharArray()) {
            rev = c+rev;
        }
        // String arg = new String(rev);
        System.out.println(rev);
       

    }

    public static ArrayList<Integer> input() {
    ArrayList<Integer> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    input = input.replaceAll("[\\[\\],]", " ");

    Scanner ss = new Scanner(input);

    while(ss.hasNextInt()) {
        arr.add(ss.nextInt());
    }

    return arr;
}
}