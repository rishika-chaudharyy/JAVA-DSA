//Write a program to find the sum of primary and secondary diagonal in a matrix
public class DiagonalSum {

    // this code has time complexity of O(n^2) which is not good
    // public static int findDiagonalSum(int matrix[][]){
    // int sum=0;
    // for(int i=0;i<matrix.length;i++){
    // for(int j=0;j<matrix[0].length;j++){
    // if(i==j){
    // sum+=matrix[i][j];
    // }else if(i+j==matrix.length-1){
    // sum+=matrix[i][j];
    // }
    // }
    // }
    // return sum;
    // }

    // let us optimize it to O(n)
    public static int findDiagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // condition for primary diagonal
            sum += matrix[i][i];
            // condition for secondary diagonal
            // also here we need to add a condition for overlapping here i !=j
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - 1 - i];
            }

        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println(findDiagonalSum(matrix));
    }
}
