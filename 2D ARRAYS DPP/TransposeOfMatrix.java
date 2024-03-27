//Write a program to find the transpose of a matrix
public class TransposeOfMatrix {
    public static void printTranspose(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int transposeMatrix[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 2, 3, 7 }, { 5, 6, 7 } };
        printTranspose(matrix);
    }
}
