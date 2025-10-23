import java.util.Iterator;
import java.util.*;

public class Hashiterator {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");

        Iterator it = cities.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
// advanced for loop
        for(String city:cities) {
            System.out.println(city);
        }
    }
}
