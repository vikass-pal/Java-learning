public class setithbit {

    public static int settithbit(int n , int i) {
        int bitMask = 1<<i;
        return n | bitMask; // Set the ith bit to 1
    }
    public static void main(String[] args) {
     
        settithbit(10, 2);
    }
}

