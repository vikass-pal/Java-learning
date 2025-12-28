import java.util.*;
public class firstCharofEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str = "aabbcde";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(map.get(c) % 2 == 0) {
                System.out.println(c);
                break;
            }
            System.out.println("-1");
        }
       
    }
}