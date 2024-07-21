//Write a program to find catalan number

import java.util.*;

public class CatalanRecursionMemoizationTabulation {
    public static int catalanRecursion(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanRecursion(i) * catalanRecursion(n - i - 1);
        }
        return ans;
    }

    public static int catalanMemoization(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        if (n == 1 || n == 0) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += catalanMemoization(i) * catalanMemoization(n - i - 1);
        }

        return dp[n] = ans;

    }

    public static int catalanTabulation(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(catalanRecursion(n));
        System.out.println(catalanMemoization(n));
        System.out.println(catalanTabulation(n));
    }
}
