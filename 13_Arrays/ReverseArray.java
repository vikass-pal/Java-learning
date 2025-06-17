public class ReverseArray {
    public static void reverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while(first< last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
     

    public static void main(String[] args) {
        int numbers[] = {2,3,5,6,7,8};
        reverseArray(numbers);
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i] + "");
        }
        // System.out.println();
    }
}
