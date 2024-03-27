//Print the number of 7s that are in a 2d array

public class CountNumberOfAnyElement {
    public static int countSeven(int matrix[][]) {
        int countOfSeven = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    countOfSeven++;
                }
            }
        }
        return countOfSeven;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(countSeven(matrix));
    }
}