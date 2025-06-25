public class Questions2D {

    // print no of 7s
    // public static int Numberof7(int matrix[][],int key) {
    //     int count = 0;
    //     for(int i=0;i<matrix.length;i++) {
    //         for(int j=0;j<matrix[0].length;j++) {
    //             if(matrix[i][j] == key){
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println("count is " + count);
    //     return count;
    // }

    //sum of numbers in second row

    public static void Secondrowsum(int matrix[][]) {
        int sum = 0;
        for(int i = 0;i<matrix[0].length;i++) {
            sum = sum + matrix[1][i];
        }
        System.out.println("Sum = " + sum);
    }


    public static void main(String[] args) {
        int matrix[][] = { {1,4,9},{11,4,3},{2,2,3} };
        int key = 7;
        // Numberof7(matrix,key);
        Secondrowsum(matrix);


    }
}
