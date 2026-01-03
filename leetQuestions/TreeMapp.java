import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {
        // tree is in proper alphabetical order
        TreeMap<String,Integer> tm = new TreeMap<>();
         tm.put("India",100);
        tm.put("US",50);
        tm.put("China",150);

           HashMap<String, Integer> hm = new HashMap<>();   
        hm.put("India",100);
        hm.put("US",50);
        hm.put("China",150);
        
        System.out.println(tm);
        System.out.println(hm);

    }
}
