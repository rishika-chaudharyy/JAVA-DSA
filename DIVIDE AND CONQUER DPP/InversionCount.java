//Given an array of integers , find the inversion count in the array . For an array inversion count indicates how far(or close) the array is from being sorted . If the array is already sorted , inversion count is 0 and if the array is reversed sorted then the count is maximum . Formally , two elements a[i] and a[j] forms an inversion if a[i]>a[j] and i<j

public class InversionCount {

    public static int countInversions(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return 0;
        }

        int count = 0;
        // calculate mid
        int mid = si + (ei - si) / 2;
        // inner function call for left part
        count += countInversions(arr, si, mid);
        // inner function call for right part
        count += countInversions(arr, mid + 1, ei);

        // merging the array
        count += merge(arr, si, mid, ei);
        return count;
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        // creating temporary array
        int temp[] = new int[ei - si + 1]; // size to accommodate both left and right parts

        // iterators for left, right, and temporary arrays
        int i = si;
        int j = mid + 1;
        int k = 0;
        int pairs = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                // When there's an inversion
                pairs += mid - i + 1;
                temp[k++] = arr[j++];
            }
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

        return pairs;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 6, 4, 1, 3, 5 };
        int inversionCount = countInversions(arr, 0, arr.length - 1);
        System.out.println("Inversion Count: " + inversionCount);
    }
}
