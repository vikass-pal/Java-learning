import java.util.*;
public class MajorityElements {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,3,3,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); // alternative approach
        }
        // Set<Integer> keySet = map.keySet();
        for(Integer key:map.keySet()) {
            if(map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
    }
}

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1) ;

            } else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet) {
            if(map.get(key) > nums.length/3 ) {
                 ans.add(key);
            }
        }
        return ans;
        
    }
}
//     public List<Integer> majorityElement(int[] nums) {
//         HashMap<Integer,Integer>map = new HashMap<>();
//         for(int i=0;i<nums.length;i++) {
//             if(map.containsKey(nums[i])) {
//                 map.put(nums[i],map.get(nums[i]) + 1) ;

//             } else{
//                 map.put(nums[i],1);
//             }
//         }
//         Set<Integer> keySet = map.keySet();
//         for(Integer key : keySet) {
//             if(map.get(key) > nums.length/3 ) {
//                  System.out.println(key);
//             }
//         }
//         return -1;
//     }
// }
