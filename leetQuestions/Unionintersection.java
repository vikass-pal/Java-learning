import java.util.HashSet;
public class Unionintersection {
     public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6,7};

        // union
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++) {
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++) {
            set.add(arr2[i]);
        }
        System.out.println("Union is: " + set.size());

        // intersection
        set.clear();
        for(int i=0;i<arr1.length;i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for(int i=0;i<arr2.length;i++) {
            if(set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection is: " + count);
     }
}
