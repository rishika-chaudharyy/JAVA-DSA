//Write a program to sort the given array in descending order using counting sort
//TC is O(n+range)

public class CountingSortReverse {
    public static void countSortDescending(int array[]) {
        // finding range
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }

        // creating frequency array to store frequency
        int countFreq[] = new int[largest + 1]; // becz the range will be 0-range

        // storing frequency
        for (int i = 0; i < array.length; i++) {
            countFreq[array[i]]++;
        }

        // sorting those frequencies
        int j = 0;
        for (int i = countFreq.length - 1; i >= 0; i--) {
            while (countFreq[i] > 0) {
                array[j] = i;
                
                j++;
                countFreq[i]--;
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
        countSortDescending(array);
        printArray(array);
    }
}
