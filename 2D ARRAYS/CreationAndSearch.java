//Write a program to create a 2D array , taking user's input for element and also write a function to search for a key in that matrix

import java.util.*;

public class CreationAndSearch {
    //TC is O(n^2)
    public static boolean searchKey(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of the matrix");
        int n = sc.nextInt();
        System.out.println("Enter the columns of the matrix");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];

        // taking elements input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // printing the elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.err.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // searching for the key
        int key = 1;
        searchKey(matrix, key);
        sc.close();

    }
}