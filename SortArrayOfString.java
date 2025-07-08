public class SortArrayOfString {
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void sortArray(String[] fruites,int si, int ei) {
        //base case
        if(si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        sortArray(fruites, si, mid); // sort left part
        sortArray(fruites, mid+1, ei); //sort Right part
        merge(fruites, si, ei, mid); // merge the two parts
    }

    public static void merge(String[] fruites,int si, int ei, int mid) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid+1;
        int k = 0;
        // merge the two parts
        while(i <=mid && j<=ei) {
            if(fruites[i].compareTo(fruites[j]) < 0) {
                temp[k] = fruites[i];
                fruites[i] = fruites[j];
                k++; i++;
            }
            temp[k] = fruites[j];
            fruites[j] = fruites[i];
            j++;k++;
        }
        // left part
        while(i<=mid){
            temp[k++] = fruites[i++];
        }
        while(j<=ei) {
            temp[k++] = fruites[j++];
        }
        // merge
        for(k=0,i=si;k<temp.length;k++,i++) {
            fruites[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        String[] fruits = { "sun", "earth", "mars", "mercury" };
        sortArray(fruits, 0, fruits.length - 1);
        printArray(fruits);
    }
}
