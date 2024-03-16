//Write a program to print all the total pairs of elements in an array also total number of pairs

//Time complexity is O(n^2)
public class ArrayPairs {
    public static void printPairs(int array[]) {
        int totalPairs = 0;
        for (int i = 0; i < array.length; i++) {

            int curr = array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + curr + "," + array[j] + ")" + " ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs :" + totalPairs);
    }

    public static void main(String args[]) {
        int array[] = { 2, 4, 6, 8, 10 };
        printPairs(array);
    }
}
