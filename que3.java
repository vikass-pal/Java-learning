import java.util.*;
public class que3 {
    public static void main(String[] args) {
        String str = input();
        char max = great(str);
        if (max == '\0') {
            System.out.println(-1);
        } else {
            System.out.println(max);
        }
    }
     
    //  public static ArrayList<String> input() {
    //     ArrayList<String> arr= new ArrayList<>(); 
    //     Scanner sc = new Scanner(System.in);
    //     String input = sc.nextLine();
    //     input = input.replace("[","").replace("]","");
    //     String[] parts = input.split("[,\\s]+");
    //     for(String s:parts) {
    //         if(!s.isEmpty()) {
    //             arr.add(s);
    //         } 
    //     }
    //     return arr;
    //  }
    public static String input() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
     public static char great(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++) {
            char ch = str[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length;i++) {
            char ch = str[i];
          if(map.containsKey(ch) && map.get(ch) > 1) {
            return ch;
          }
        }
        return '\0';

     }
}
