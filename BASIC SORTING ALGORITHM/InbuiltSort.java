
//Write a program to implement sorting using java collections framework (JCF)
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void printArray(Integer array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer array[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(array);
        printArray(array);
        Arrays.sort(array, 0, 3);
        printArray(array);
        Arrays.sort(array, Collections.reverseOrder());
        printArray(array);
        Arrays.sort(array, 0, 3, Collections.reverseOrder());
        printArray(array);

    }
}
