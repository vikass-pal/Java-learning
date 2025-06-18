public class MaxsubarrayKadanes {

    public static void kadanesAlgorithm(int numbers[]) {
        int ms =Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<numbers.length;i++) {
            cs = cs + numbers[i];
            if(cs<0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
            
        }
        System.out.println("Current sum: " + cs);
    }

    public static void main(String[] args) {
        int numbers[] = {-1,-6,-3};
        kadanesAlgorithm(numbers);

    }
}
