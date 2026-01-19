import java.util.*;
public class amstrong1 {
    public static void main(String[] args) {
         ArrayList<Integer> number = input();
         for(int i=0;i<number.size();i++) {
            if(isArmstrong(number.get(i))) {
                System.out.println(number.get(i) + " is an Armstrong number");
            } else {
                System.out.println(number.get(i) + " is not an Armstrong number");
            }
         }
    }
    public static ArrayList<Integer> input() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "");
        String[] parts = input.split("[,\\s]+");
        for(String s: parts) {
            if(!s.isEmpty()) {
arr.add(Integer.parseInt(s));
            }
        }
        
        return arr;
    }
    public static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while(original>0) {
            int digit = original%10;
            sum+= Math.pow(digit,digits);
            original=original/10;
        }
        return sum==num;
    }
   
}

