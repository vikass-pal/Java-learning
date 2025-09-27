import java.util.*;

public class Hashmapp {
    public static void main(String args[])
     {
        // create
        HashMap<String,Integer> hm = new HashMap<>();

        // insert
        hm.put("India", 120);
        hm.put("US", 30);
        hm.put("China", 150);

        System.out.println(hm);

        // get
        int population = hm.get( "India");
        System.out.println(population); 

        System.out.println(hm.get("Indonesia"));

        // contains key
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove
        hm.remove("China");
        System.out.println(hm); 

        // size
        System.out.println(hm.size());
    }
    
}
