import java.util.*;
public class ArraylistAIntro {
    public static void main(String[] args) {
        // java collections framework
        // ArrayList is a resizable array implementation of the List interface 
         ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList <>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // get operation
        System.out.println(list.get(2)); // prints the element at index 2
        // delete
        list.remove(1); // removes the element at index 2
        System.out.println(list);
        list.set(2, 10);
        // contains
        System.out.println(list.contains(10)); // checks if 10 is present in the list
        System.out.println(list.size()); // returns the size of the list
    }


}
