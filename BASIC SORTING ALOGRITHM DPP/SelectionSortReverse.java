//Write a program to sort the given array in descending order using Selection sort
//TC is O(n^2)

public class SelectionSortReverse {
    public static void selectionSortDescending(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[minPos]) {
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
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
        selectionSortDescending(array);
        printArray(array);
    }
}
