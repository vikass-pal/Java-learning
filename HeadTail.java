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
    public static int size;

    public void addFirst(int data) {
        // step 1
        Node newNode = new Node(data);
        size++;
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
        size++;
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //  add in middle

    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;


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

    // size


    public static void main(String[] args) {
        HeadTail ll = new HeadTail();
        
       ll.addFirst(2);
       
       ll.addFirst(1);
       
       ll.addLast(3);
       
       ll.addLast(4);
       ll.add(2, 9);
       ll.print();
        System.out.println(ll.size);
        
    }
}
