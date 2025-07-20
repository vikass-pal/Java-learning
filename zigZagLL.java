public class zigZagLL {
      public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
      public static Node head;
    
    public void Zigzag() {
        // mid
         Node slow = head;
        Node fast = head;

        while(fast != head && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        } 
        Node mid =  slow;

        // reverse 2nd half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

        // alternate merge(zig zag merge) 
    }


    public static void main(String[] args) {
         
    }
}
