//Write a program to print all the subarrays and total number of subarrays in an array
public class Subarrays {
    public static void printSubarrays(int array[]) {
        int totalSubarray = 0;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays :" + totalSubarray);
    }

    public static void main(String args[]) {
        int array[] = { 2, 4, 6, 8, 10 };
        printSubarrays(array);
    }
}
