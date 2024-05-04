//1.Place N queens on a NXN chess board such that no 2 queens can attack each other 
//2.Count total number of ways in which we can solve NQueens problem
//3.Check if the problem can be solved and print 1 solution to N Queens problem

//TC is O(n!)
//SC is O(n)

//Solution for 1 and 2

// public class NQueens {
//     public static void nQueens(char board[][], int row) {
//         // base case
//         if (row == board.length) {
//             // printBoard(board);
//             count++;
//             return;
//         }

//         // recursive function call
//         for (int j = 0; j < board.length; j++) {
//             if (isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row + 1);
//                 // backtracking
//                 board[row][j] = 'X';
//             }

//         }
//     }

//     // to count total ways
//     static int count = 0;

//     public static boolean isSafe(char board[][], int row, int col) {
//         // vertically up
//         for (int i = row - 1; i >= 0; i--) {
//             if (board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         // diagonally left
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         // diagonally right
//         for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void printBoard(char board[][]) {
//         System.out.println("-----chess board-----");
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         int n = 5;

//         // initialising the board
//         char board[][] = new char[n][n];
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 board[i][j] = 'X';
//             }
//         }

//         nQueens(board, 0);
//         System.out.println("Total number of ways are : " + count);
//     }
// }

//Solution for 3

public class NQueens {
    public static boolean nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }

        // recursive function call
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                // backtracking
                board[row][j] = 'X';
            }

        }
        return false;
    }

    // to count total ways
    static int count = 0;

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonally left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonally right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----chess board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 3;

        // initialising the board
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }

        if (nQueens(board, 0)) {
            System.out.println("Solution exists");
            printBoard(board);
        } else {
            System.out.println("Solution does not exists");
        }
        // System.out.println("Total number of ways are : " + count);
    }
}
