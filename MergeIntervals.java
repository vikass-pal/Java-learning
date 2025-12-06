import java.util.Arrays;

public class MergeIntervals {
   
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        int res[][] = new int[n][2];
        int e = 0;
        res[0] = intervals[0];
        for (int i = 0; i < n; i++) {
            if (intervals[i][0] <= res[e][1]) {
                res[e][1] = Math.max(res[e][1], intervals[i][1]);
            } else {
                e++;
                res[e] = intervals[i];
            }
        }
        return Arrays.copyOfRange(res, 0, e + 1);
    }


// class Solution {
//     public int[][] merge(int[][] intervals) {
        
//         Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        
//         List<int[]> result = new ArrayList<>();

//         int[] current = intervals[0];
//         result.add(current);

//         for(int i = 1; i < intervals.length; i ++) {
//             int[] next = intervals[i];

//             if(next[0] <= current[1]) {
//                 current[1] = Math.max(next[1], current[1]);
//             } else {
//                 current = next;
//                 result.add(current);
//             }
//         }

//         return result.toArray(new int[result.size()][]);
//     }
// }

}
