//Write a program to sort the given array in descending order using Bubble sort
//TC is O(n^2) but for already sorted array TC is O(n)
public class BubbleSortReverse {
    public static void bubbleSortDescending(int array[]) {
        int n = array.length;
        boolean swapped; // for already sorted array

        for (int turn = 0; turn < n - 1; turn++) {
            swapped = false;
            for (int j = 0; j < n - 1 - turn; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
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
        bubbleSortDescending(array);
        printArray(array);
    }
}