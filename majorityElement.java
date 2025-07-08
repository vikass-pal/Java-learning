public class majorityElement {
    public static int MajorityElement(int arr[]) {
        int half = arr.length /2;
        for(int i=0;i<arr.length;i++) {
            int count = 0;
            for(int j=0;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    count +=1;
                }
            }
            if(count > half){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int result = MajorityElement(arr);
        System.out.println("Majority Element: " + result);
    }
}
