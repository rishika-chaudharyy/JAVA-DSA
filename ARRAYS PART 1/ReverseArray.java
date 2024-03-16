//Write a program to reverse the array of an elements keeping the space constant

public class ReverseArray {
    public static void reverseArray(int array[]) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start]; // swapping
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

    }

    public static void main(String args[]) {
        int array[] = { 2, 4, 6, 8, 10 };

        reverseArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
