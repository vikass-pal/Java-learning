import java.util.*;

public class LinkedHashmapp {
    public static void main(String[] args) {
        // if wanted output to be same as input then LinkedHash is used
        // it uses doubly linked list for down wala
        
           LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();   
        lhm.put("India",100);
        lhm.put("US",50);
        lhm.put("China",150);

    
           HashMap<String, Integer> hm = new HashMap<>();   
        hm.put("India",100);
        hm.put("US",50);
        hm.put("China",150);

        System.out.println(lhm);
        System.out.println(hm);
    }
}

// Rest everyThing is same as hashmap implementation
