import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String arr[] = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String i : arr) {
            if(i.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if(!i.equals("") && !i.equals(".") && !i.equals("..")) {
                stack.push(i);
            }
        }
            StringBuilder sb = new StringBuilder();
            for(String dir : stack) {
                sb.append("/");
                sb.append(dir);
            }
            return sb.length() == 0 ? "/" : sb.toString();  
    }
} 
