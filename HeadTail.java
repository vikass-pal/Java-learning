import java.util.LinkedList;

public class HeadTail {
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

    public void addFirst(int data) {
        // step 1
        Node newNode = new Node(data);
// if my linked list is empty
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 newNode ka next = head
        newNode.next = head;
        // step 3
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = tail;
        tail = newNode;
    }

    public void print() {
        // if(head == null) {
        //     System.out.println("Empty");
        //     return;
        // }
       Node temp = head;
       while(temp != null) {
        System.out.println(temp.data + " ");
        temp = temp.next;
       } 
       System.out.println("empty");
    }

    public static void main(String[] args) {
        HeadTail ll = new HeadTail();
        ll.print();
       ll.addFirst(2);
       ll.print();
       ll.addFirst(1);
       ll.print();
       ll.addLast(3);
       ll.print();
       ll.addLast(4);
       ll.print();

        
    }
}
