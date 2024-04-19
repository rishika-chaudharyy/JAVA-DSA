//Print numbers from n to 1 (Decreasing order) using Recursion

public class PrintDecreasingNumbers {
    public static void printDecreasingNumbers(int n) {
        if (n == 1) { // base case
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");// kaam
        printDecreasingNumbers(n - 1);// inner function call

    }

    public static void main(String args[]) {
        printDecreasingNumbers(10);
    }
}