import java.util.*;
public class Stringin {
   public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
String input = sc.nextLine();

ArrayList<String> arr = new ArrayList<>();


if (!input.isEmpty()) {

    // Remove brackets if present
    input = input.replace("[", "").replace("]", "");

    // Split by comma OR space
    String[] parts = input.split("[,\\s]+");

    for (String s : parts) {
        if (!s.isEmpty()) {
            arr.add(s);
        }
    }
}
    System.out.println(arr);
   }
}
