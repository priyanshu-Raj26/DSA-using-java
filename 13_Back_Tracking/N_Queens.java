public class N_Queens {
    
    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }


        //vertical left up 
        for (int i = row-1,j=col-1; i >= 0 && j>=0 ; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }


        //vertical right up
        for (int i = row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        
        return true;
    }


public static void NQueens(char board[][], int row) {
    if (row == board.length) {
        printBoard(board);
        count++;
        return;
    }

    //Column loop
    for (int j = 0; j < board.length; j++) {
        if(isSafe(board, row, j)) {
            board[row][j] = 'Q';
            NQueens(board, row+1);  //function call 
            board[row][j] = 'X';    // Backtracking step
        }
    }
}


public static void printBoard(char board[][]) {
    System.out.println("______ chess board ________");
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board.length; j++) {
            System.out.print(board[i][j]  + " ");
        }
        System.out.println();
    }
}


static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        NQueens(board, 0);
        System.out.println("Total ways to solve N queens = " + count);
    }
}
