public class RotatedArray {
     public static int Search(int arr[], int si, int ei, int target) {
        if(si > ei) {
            return -1;
        }
        int mid = si + (ei-si) / 2;

        if(arr[mid] == target) {
            return mid;
        }
        if(arr[si] <=arr[mid]) {
            // case a left part 
            if(arr[si] <= target && target<=arr[mid]) {
                return Search(arr,si,mid-1,target);
            } else{
               return Search(arr,mid+1,ei,target);
            }
        }
        else{
            if(arr[mid]<= target && target <= arr[ei]) {
                return Search(arr,mid+1,target,ei);
            } else{
                return Search(arr,si,mid-1,target);
            }
        }
     }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = Search(arr, 0, arr.length - 1, target);
        System.out.println("Element found at index: " + result);
    }
}
