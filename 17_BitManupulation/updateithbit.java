public class updateithbit {
    public static int clearIthbit(int n, int i) {
        int bitMask = 1<<i;
        return n & ~(bitMask); // Clear the ith bit to 0
    }
    
    public static int settithbit(int n , int i) {
        int bitMask = 1<<i;
        return n | bitMask; // Set the ith bit to 1
    }
    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthbit(n,i);

        // }
        // else{
        //     return settithbit(n,i);
        // }
        n = clearIthbit(n, i); // Clear the ith bit
        int BitMask = newBit<<i; // Create a bitmask for the new bit
        return n | BitMask; // Set the ith bit to newBit 
    }
    public static void main(String[] args) {
      System.out.println(  updateIthBit(10, 2, 1));
    }
}
