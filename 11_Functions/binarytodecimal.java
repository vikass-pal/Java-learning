public class binarytodecimal {

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10; //to get last digit from binNum
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10; //To eliminate last digit from binNum
        }
        System.out.println("Decimal of " + myNum + " is " + decNum);
       
    }
    public static void main(String[] args) {
        binToDec(1001);
    }
}
