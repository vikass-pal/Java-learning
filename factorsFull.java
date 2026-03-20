import java.util.*;
public class factorsFull{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++) {
        //     arr[i] = sc.nextInt();
        // }

        int[] result = factor(n);
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]+" ");
        }
    }

    public static int[] factor(int a) {
       ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i*i<=a;i++) {
            if(a%i == 0) {
                list.add(i);
                a = a/10;
            }
        }
        // if(a > 1){
        //     list.add(a);
        // }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}