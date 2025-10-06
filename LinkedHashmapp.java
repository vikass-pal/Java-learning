import java.util.*;

public class LinkedHashmapp {
    public static void main(String[] args) {
        // if wanted output to be same as input then LinkedHash is used
        // it uses doubly linked list for down wala
        LinkedHashMap<Integer,String>lhm = new LinkedHashMap<>();
        lhm.put(1,"one");
        lhm.put(2,"two");
        lhm.put(3,"three");

        HashMap<Integer,String> hm = new HashMap<>();   
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");

        System.out.println(lhm);
        System.out.println(hm);
    }
}

// Rest everyThing is same as hashmap implementation
