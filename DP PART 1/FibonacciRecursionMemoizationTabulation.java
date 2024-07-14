//Write a program to find the fibonacci number using dp
//This is a code of memoization and TC is O(N)

public class FibonacciRecursionMemoizationTabulation {
    public static int getFibonacciRecursion(int n) {
        if (n == 0 || n == 1) { // base case
            return n;
        }
        return getFibonacciRecursion(n - 1) + getFibonacciRecursion(n - 2);
    }

    public static int getFibonacciMemoization(int n, int dp[]) {
        if (n == 0 || n == 1) { // base case
            return n;
        }

        if (dp[n] != 0) {// not 0 means it is calculated
            return dp[n];
        }

        dp[n] = getFibonacciMemoization(n - 1, dp) + getFibonacciMemoization(n - 2, dp);

        return dp[n];
    }

    // This is a code of tabulation and TC is O(N)

    public static int getFibonacciTabulation(int n) {
        // table
        int dp[] = new int[n + 1];
        // initialisation
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1]; // array of size n+1 and by default initialised with 0
        System.out.println(getFibonacciRecursion(n));
        System.out.println(getFibonacciMemoization(n, dp));
        System.out.println(getFibonacciTabulation(n));
    }
}