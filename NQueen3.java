public class NQueen3 {
    public static boolean NQueen(char board[][], int row) {
        // base case
        if(row == board.length) {
            count++;
            return true;
        }

        for(int j = 0; j<board.length;j++) {
            if(isSafe(board,row,j)) {
                 board[row][j] = 'Q';
                 if(NQueen(board, row+1)) {
                    return true; // If a solution is found, return true
                 }

            NQueen(board, row+1);
             board[row][j] = 'x';
            } 
           
        }
        return false; // If no solution is found, return false
    }
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for(int i =row-1;i>=0;i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left up
        for(int i = row-1, j=col-1; i>=0 && j>=0;i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            } 
        }

        return true;

    }
    static int count = 0;

    public static void printBoard(char board[][]) {
        System.out.println("--------chess---------");
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                System.out.print(board[i][j] + " ");
            }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
               board[i][j] = 'x';
            }
        }
        if(NQueen(board, 0)) {
            System.out.println("Solution found:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
        
        
        
    }
}
