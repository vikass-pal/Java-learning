import java.util.*;
public class CountDistinctElement {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,2,3,1,5,6,7,5};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<num.length;i++) {
            set.add(num[i]);
            
        }
        System.out.println(set.size());
    }
}
 