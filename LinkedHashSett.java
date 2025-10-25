import java.util.*;
import java.util.Set;

// linked hashset is used to get elements exactly in order as it was entered
public class LinkedHashSett {
    public static void main(String[] args) {
         HashSet<String> hm = new HashSet<>();

        hm.add("India");
        hm.add("US");
        hm.add("China");
        hm.add("Nepal");
        System.out.println(hm);
        // Iterate: used to get every key
        // Set<String> keys = hm.keySet();
        // System.out.println(keys); 

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("US");
        lhs.add("China");
        lhs.add("Nepal");
        System.out.println(lhs);
    }
}
