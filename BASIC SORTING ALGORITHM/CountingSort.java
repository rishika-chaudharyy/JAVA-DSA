//Write a program to sort an array using count sort
public class CountingSort {
    public static void countingSort(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) { // finding the range or the highest element i.e 7
            largest = Math.max(array[i], largest);
        }

        // making array to store frequency
        int countFreq[] = new int[largest + 1]; // as our array range is from 0-7 so largest+1

        for (int i = 0; i < array.length; i++) { // storing frequency by this loop
            countFreq[array[i]]++;
        }

        // sorting or distributing the values according to frequency
        int j = 0;
        for (int i = 0; i < countFreq.length; i++) {
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
        int array[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingSort(array);
        printArray(array);
    }
}
