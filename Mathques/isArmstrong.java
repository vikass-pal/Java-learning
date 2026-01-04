public class isArmstrong {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        int Copy = num;
        while(Copy !=0) {
            int rem = Copy % 10;
            sum += (rem*rem*rem);
            Copy = Copy/10;
        }
        if(sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
