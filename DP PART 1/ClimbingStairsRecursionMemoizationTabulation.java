
//Count ways to reach nth stairs . The person can climb either one stairs or two stair at a time.
import java.util.*;

public class ClimbingStairsRecursionMemoizationTabulation {

    public static int countWaysRecursion(int n) {// TC is O(2^n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (n == 2 || n == 3) {
            return n;
        }

        return countWaysRecursion(n - 1) + countWaysRecursion(n - 2);
    }

    public static int countWaysMemoization(int n, int dp[]) {// TC is O(n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (n == 2 || n == 3) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = countWaysMemoization(n - 1, dp) + countWaysMemoization(n - 2, dp);
        return dp[n];
    }

    public static int countWaysTabulation(int n) {// TC is O(n)
        int dp[] = new int[n + 1];

        dp[0] = 1;
        // dp[1] = 1;
        // dp[2] = 2;
        // dp[3] = 3;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(countWaysRecursion(n));
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(countWaysMemoization(n, dp));
        System.out.println(countWaysTabulation(n));
    }
}
