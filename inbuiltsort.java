import java.util.ArrayList;
import java.util.Collections;
public class inbuiltsort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(4);

        // Sort the array using in-built sort

        System.out.println("Sorted list: " + list);
        // descending

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list in descending order: " + list);
    }
    
}
