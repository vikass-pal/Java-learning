import java.util.*;
public class Container {
    public static int StoreWater(ArrayList<Integer> height) {
        int maxWater = 0;

        // brute force approach
        for(int i=0;i<height.size();i++) {
            for(int j= i+1;j<height.size();j++) {
                int mx = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int water = mx * width;
                maxWater = Math.max(maxWater, water);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
         height.add(6);
         height.add(2);
         height.add(5);
         height.add(4);
         height.add(8);
         height.add(3);
         height.add(7);   
        System.out.println(StoreWater(height));
    }
}