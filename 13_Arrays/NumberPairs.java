public class NumberPairs {
    public static void printPairs(int numbers[]) {
        int totalPairs = 0;
        for(int i = 0; i<numbers.length;i++) {
            int curr = numbers[i];
            for(int j =i+1;j<numbers.length;j++) {
                System.out.println("(" + curr + "," + numbers[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + totalPairs);
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,5,6};
        printPairs(numbers);
       
    }


}

// agar non repetative chaiye toh j=i+1;
// agar repetative chaiye jaise 5,2 aur 2,5 dono chaiye toh j=0;
