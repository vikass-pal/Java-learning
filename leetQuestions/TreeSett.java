import java.util.HashSet;
import java.util.*;
// to get sorted elements treeset is used
public class TreeSett {
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


        TreeSet<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("US");
        ts.add("China");
        ts.add("Nepal");
        System.out.println(ts);
    }
}
