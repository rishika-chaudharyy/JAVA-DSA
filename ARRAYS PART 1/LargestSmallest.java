//Write a program to find the largest and the smallest element in an array

//import java.util.*;

public class LargestSmallest {

    public static int largestElement(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int smallestElement(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 3, 5, 2, 6 };
        System.out.println("The largest element is:" + largestElement(numbers));
        System.out.println("The Smallest element is:" + smallestElement(numbers));

    }
}
