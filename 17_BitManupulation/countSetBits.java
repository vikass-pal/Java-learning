public class countSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while(n>0) {
            while(n > 0) {
                if((n&1) != 0) {
                    count++;
                }
                n = n>>1; // Right shift n by 1
            }
            
        }
        return count;

    }
    public static void main(String[] args) {
       System.out.println(countSetBits(15)); 
    }
}
