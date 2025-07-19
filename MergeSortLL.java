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

      public void print() {
        // if(head == null) {
        //     System.out.println("Empty");
        //     return;
        // }
       Node temp = head;
       while(temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
       } 
       System.out.print("empty");
    }

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
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
         
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
        }
        return mergedLL.next;
        
    }

    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left and right mergeSOrt
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }

     public static void main(String[] args) {
          MergeSortLL list = new MergeSortLL();

          // Manually create the linked list using Node class
          list.head = new Node(5);
          list.head.next = new Node(4);
          list.head.next.next = new Node(3);
          list.head.next.next.next = new Node(2);
          list.head.next.next.next.next = new Node(1);

          System.out.println("Original Linked List:");
          list.print();

          // Sort the linked list using mergeSort
          list.head = list.mergeSort(list.head);

          System.out.println("\nSorted Linked List:");
          list.print();
     }
}
