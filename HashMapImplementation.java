import java.util.*;

public class HashMapImplementation {
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;
            // Node next;

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
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchinLL(K key,int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0;i<ll.size();i++) {
                Node node = ll.get(i);
                if(node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = N * 2;
            for(int i=0;i<buckets.length;i++) {
                buckets[i] = new LinkedList<>();
            }
            // get nodes and add in new bucket
            for(int i=0;i<oldBuck.length;i++) {
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0;j<ll.size();j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = HashFunction(key);
            int di = SearchinLL(key,bi);
            if(di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else{
                buckets[bi].add(new Node(key,value));
                n++;
            }

            double lamda = (double)n/N;
            if(lamda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = HashFunction(key);
            int di = SearchinLL(key,bi);
            if(di != -1) {
                return true;
            } else{
                return false;
            }
        }

        public V get(K key) {
            int bi = HashFunction(key);
            int di = SearchinLL(key,bi);
            if(di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else{
                return null;
            }
        }

        public V remove(K key) {
            int bi = HashFunction(key);
            int di = SearchinLL(key,bi);
            if(di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else{
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0;i<buckets.length;i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n==0;
        }
    }
}
