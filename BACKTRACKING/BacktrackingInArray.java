//First use recursion to store values in array index then use backtracking to subtract 2 from each value
//TC is O(n)
//SC is O(n)

public class BacktrackingInArray {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArray(arr);
            return;
        }

        arr[i] = val;
        changeArray(arr, i + 1, val + 1);// recursive function
        // backtracking step
        arr[i] = arr[i] - 2;

    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        // System.out.println("\n");
        printArray(arr);
    }
}