//Write a program to sort an array using quick sort
//TC in average cases is O(nlogn)
//in worts cases it is O(n^2)
//SC is constant O(1)

public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) { // base case
            return;
        }

        // kaam
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1); // left part
        quickSort(arr, pidx + 1, ei); // right part

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // taking last element as pivot

        int i = si - 1; // to do partition
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 2, 5, 8, -5 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
