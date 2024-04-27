//Write a program to sort a given array using merge sort

//TC is O(nlogn)
//SC is O(n) --> used temp array 
//it is a depth first approach

public class MergeSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // calculate mid
        int mid = si + (ei - si) / 2;
        // inner function call for left part
        mergeSort(arr, si, mid);
        // inner function call for right part
        mergeSort(arr, mid + 1, ei);

        // merging the array
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // creating temporary array
        int temp[] = new int[ei - si + 1]; // size to accommodate both left and right parts

        // iterators for left, right, and temporary arrays
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copying any remaining elements from the left or right side
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copying temp back to the original array
        for (int l = 0, m = si; l < temp.length; l++, m++) {
            arr[m] = temp[l];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
