class doubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode; 
    }
    // remove first
    public int removeFirst() {

        if(head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = tail= null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
       

    }
    //  public int removeLast() {
    //     if(size == 0) {
    //         System.out.println("Empty");
    //         return Integer.MIN_VALUE;
    //     } else if(size == 1) {
    //         int val = head.data;
    //         head = tail = null;
    //         return val;
    //     }
    // }
    
    public void reverse() {
         Node curr = head;
         Node prev = null;
         Node next;

         while(curr != null) {
           next = curr.next;
           curr.next = prev;
           curr.prev = next;
              prev = curr;
           curr = next;
        

         }
         head = prev;
    }


     

    public static void main(String args[]) {
        doubleLL dll = new doubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        // dll.removeFirst();
        dll.reverse();
        dll.print();
    }
    
}