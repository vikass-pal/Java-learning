import java.util.*;
public class QueueUsingDeque {
    

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();
        public void push(int data) {
            deque.addLast(data);
        }
        public int pop() {
            return deque.removeFirst();
        }
        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue s = new Queue();
        s.push(1);
        s.push(2);
        s.push(3);
         System.out.println("peek = " + s.peek());
         System.out.println(s.pop());
          System.out.println(s.pop());
           System.out.println(s.pop());
    }
}


