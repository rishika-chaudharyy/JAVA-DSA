// Write a program to sort the given array using bubble sort . Also optimize the
// code to the time complexity of O(n) for already sorted array,

public class BubbleSort {
    public static void bubbleSort(int array[]) {
        int n = array.length;
        boolean swapped;

        for (int turn = 0; turn < n - 1; turn++) {
            swapped = false;
            for (int j = 0; j < n - turn - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then array is already sorted
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
        int array[] = { 5, 4, 1, 3, 2 };
        bubbleSort(array);
        printArray(array);
    }
}
