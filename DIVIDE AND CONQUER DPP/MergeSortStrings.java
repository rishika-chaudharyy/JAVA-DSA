//Apply merge sort to sort an array of strings (Assume that all the characters in strings are lowercase)

public class MergeSortStrings {
    public static void printArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(String arr[], int si, int ei) {
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

    public static void merge(String arr[], int si, int mid, int ei) {
        // creating temporary array
        String temp[] = new String[ei - si + 1]; // size to accommodate both left and right parts

        // iterators for left, right, and temporary arrays
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
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
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
