import java.util.HashMap;
import java.util.Set;

public class iterationOnHash {
    public static void main(String args[])
     {

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India", 120);
        hm.put("US", 30);
        hm.put("China", 150);
        hm.put("Nepal",5);

        // Iterate: used to get every key
        Set<String> keys = hm.keySet();
        System.out.println(keys); 

        for (String k : keys) {
            System.out.println("key =" +k+",value="+hm.get(k));
        }
     }
}
