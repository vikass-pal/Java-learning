public class primeNoOfSetBits {
    class Solution {
    public int countPrimeSetBits(int left, int right) {
        int num = 0;
        for (int i = left; i <= right; i++) {
            int a = Integer.bitCount(i);
            if (isPrime(a)) {
                num++;
            }
        }
        return num;
    }

    public boolean isPrime(int b) {
        if (b < 2)
            return false;
        for (int i = 2; i * i <= b; i++) {
            if (b % i == 0) {
                return false;
            }
        }
        return true;
    }
}

}
