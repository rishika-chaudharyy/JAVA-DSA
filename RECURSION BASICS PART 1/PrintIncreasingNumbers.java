//Print numbers in increasing order using Recursion

public class PrintIncreasingNumbers {
    public static void printIncreasingNumbers(int n) {
        if (n == 1) { // base case
            System.out.print(n + " ");
            return;
        }
        printIncreasingNumbers(n - 1); // inner function call
        System.out.print(n + " "); // kaam
    }

    public static void main(String args[]) {
        printIncreasingNumbers(5);
    }
}
