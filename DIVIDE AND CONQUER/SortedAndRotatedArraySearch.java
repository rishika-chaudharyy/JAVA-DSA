//Write a program to serach for an element in rotated and sorted array

public class SortedAndRotatedArraySearch {
    public static int rotatedAndSortedSearch(int arr[], int target, int si, int ei) {
        int mid = si + (ei - si) / 2;
        // base case
        if (si > ei) {
            return -1;
        }

        // kaam

        // case FOUND
        if (arr[mid] == target) {
            return mid;
        }
        // elements lies on line 1
        if (arr[si] <= arr[mid]) {
            // case a:
            if (arr[si] <= target && target <= arr[mid]) {
                return rotatedAndSortedSearch(arr, target, si, mid - 1);
            } else { // case b:
                return rotatedAndSortedSearch(arr, target, mid + 1, ei);
            }
        } else { // case c:
            if (arr[mid] <= target && target <= arr[ei]) {
                return rotatedAndSortedSearch(arr, target, mid + 1, ei);
            } else {// case d:
                return rotatedAndSortedSearch(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;
        System.out.println(rotatedAndSortedSearch(arr, target, 0, arr.length - 1));
    }
}
