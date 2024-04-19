//Check if the given array is sorted or not using Recursion
//TC is O(n)
//SC is O(n)

public class ArraySorted {
    public static boolean isSorted(int array[], int i) {
        // base case
        if (i == array.length - 1) {
            return true;
        }
        // kaam
        if (array[i] > array[i + 1]) {
            return false;
        }

        // inner function call
        return isSorted(array, i + 1);
    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 1 };
        System.out.println(isSorted(array, 0));
    }
}
