//Write a program to sort the given array in descending order using Insertion sort
//TC is O(n^2)
public class InsertionSortReverse {
    public static void insertionSortDescending(int array[]) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int curr = array[i];
            int prev = i - 1;
            while (prev >= 0 && array[prev] < curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = curr;
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        insertionSortDescending(array);
        printArray(array);
    }
}
