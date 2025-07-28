import java.util.Stack;

public class ReverseAstack {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        // If stack is empty, push data at bottom
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        // Return if stack is empty
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        // StackB s = new StackB();
        Stack<Integer>  s = new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(3);
        // Reverse the stack before printing
        reverseStack(s);
        printStack(s);

       
       
}
}
