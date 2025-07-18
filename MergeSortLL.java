import java.util.LinkedList;

public class MergeSortLL {
     public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;  

    private Node getMid(Node head) {
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergedLL;
        
    }

    public Node mergeSort(Node head) {
        if(head == null && head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid();
        // left and right mergeSOrt
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }

     public static void main(String[] args) {
          LinkedList<Integer> ll = new LinkedList<>();

     }
}
