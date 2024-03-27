//Write a porgram to sort the given array using insertion sort
public class InsertionSort {
    public static void insertionSort(int array[]) {
        // here we have started with i=1 because we will take prev=i-1 if i=0 then
        // prev=-1 which is invalid
        for (int i = 1; i < array.length; i++) {
            int curr = array[i]; // for saving the unsorted numbers in memory one by one
            int prev = i - 1;

            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = curr;
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
        insertionSort(array);
        printArray(array);
    }
}
