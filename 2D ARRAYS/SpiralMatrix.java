//Write a program to print the given 2D array matrix in spiral form
public class SpiralMatrix {
    public static void printSprialMatrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) { // Corrected loop condition
            // printing top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // printing right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // printing bottom
            for (int j = endCol - 1; j >= startCol && startRow != endRow; j--) { // Added condition startRow != endRow
                System.out.print(matrix[endRow][j] + " ");
            }
            // printing left
            for (int i = endRow - 1; i > startRow && startCol != endCol; i--) { // Added condition startCol != endCol
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printSprialMatrix(matrix);
    }
}
