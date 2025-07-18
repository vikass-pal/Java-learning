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
        System.out.print(temp.data + "->");
        temp = temp.next;
       } 
       System.out.print("empty");
    }

    // remove first

    public int removeFirst() {
        if(size == 0) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
       head  = head.next;
       size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2;i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // search a target in LL O(n)

    public int itrSearch(int key) {
        Node temp = head;
        int i=0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            } 
            temp = temp.next;
            i++;
        }
        return -1; 
    }

    // recursion(to get key) O(n)
    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next,key);
            if(idx == -1) {
                return -1;
            }
            return idx+1;
        
    }

    public void reverse() { //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz) {
            head = head.next;
            return ;
        }
        // main shit

        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //At slow ill have my mid
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);

        // step2- reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next =prev ;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        // step 3- compare left and right
        while(right != null) {
            if(left.data != right.data) {
                return false;
            } 
                left = left.next;
                right = right.next;
                
            
        }
        return true;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        HeadTail ll = new HeadTail();
        
       ll.addFirst(2);
       
       ll.addFirst(1);
       
       ll.addLast(2);
       
    //    ll.addLast(1);
    //    ll.add(2, 9);
    //    ll.print();
    //  ll.removeFirst();
    
    //  ll.print();
    //   ll.removeLast();
      ll.print();

    // System.out.println(ll.recSearch(3));
    // System.out.println(ll.recSearch(10));
        // ll.reverse();
        // ll.deleteNthFromEnd(3);
        // ll.print();
        System.out.println(ll.checkPalindrome());

        
    }
}
