import java.util.*;
public class isDuplicate {
    public static boolean Isduplicate(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++) {
            int count = 0;
            char ch = str.charAt(i);
            if(ch == ')') {
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count <=0) {
                    return true;  //duplicate exist
                } else{
                    s.pop();
                }
            } else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(a + b)";
        System.out.println(Isduplicate(str));
    }
}
