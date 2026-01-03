import java.util.*;
public class nonrepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
      for(int i=0;i<s.length();i++) {
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0) + 1);
      }
      for(int i=0;i<s.length();i++) {
        char ch1 = s.charAt(i);
        if(map.get(ch1)==1){
            System.err.println(ch1);
           
        } 
      }
      System.out.println(-1);
    }
}