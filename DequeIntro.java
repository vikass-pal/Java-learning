import java.util.*;
public class DequeIntro {
    public static void main(String[] args) {
        // Deque<String> deque = new ArrayDeque<String>();
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First"+deque.getFirst());
        System.out.println("Last"+deque.getLast());
         System.out.println(deque);
    }
}
