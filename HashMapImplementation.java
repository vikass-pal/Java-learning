import java.util.*;
public class HashMapImplementation<K, V> {
    private class Node {
        K key;
        V value;
        Node next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            // this.next = null;
        }
    }
    private int n;
    private int N;
    private LinkedList<Node> buckets[];

    @SuppressWarnings("unchecked")
    public HashMapImplementation() {
        this.N = 4;
        this.buckets = new LinkedList[4];
        for(int i=0;i<4;i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    private int HashFunction(K key) {
        int hc = hashCode();
        return Math.abs(hc) % N;
    }
    private int SearchinLL(K key) {
         LinkedList<Node> ll = buckets[bi];
        int di = 0;
         for(int i=0;i<ll.size();i++) { 
            Node node = ll.get(i);
            if(node.key == key) {
                return di;
            }
            di++;

         }
         return -1;

    }

    public void put(K key, V value) {
        int bi = HashFunction(key);
        int di = SearchinLL(key);
        if(di != -1) {
            Node node = buckets[bi].get(di);
            node.value = value;
        } else{
            buckets[bi].add(new Node(key,value));
            size++;
        }
    }
}
