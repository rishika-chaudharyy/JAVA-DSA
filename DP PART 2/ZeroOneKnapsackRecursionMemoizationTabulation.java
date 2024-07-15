//Write a program for the 0-1 Knapsack

public class ZeroOneKnapsackRecursionMemoizationTabulation {
    public static int KnapsackRecursion(int val[], int wt[], int W, int n) {// TC is O(2^n)
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) {// valid
            // include
            int ans1 = val[n - 1] + KnapsackRecursion(val, wt, W - wt[n - 1], n - 1);
            int ans2 = KnapsackRecursion(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {// not valid
            return KnapsackRecursion(val, wt, W, n - 1);
        }
    }

    // TC is (nW)
    public static int KnapsackMemoization(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {// valid
            // include
            int ans1 = val[n - 1] + KnapsackMemoization(val, wt, W - wt[n - 1], n - 1, dp);
            int ans2 = KnapsackMemoization(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];

        } else {// not valid
            dp[n][W] = KnapsackMemoization(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // TC is (nW)
    public static int KnapsackTabulation(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i < dp.length; i++) {// 0th col
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {// 0th row
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];// ith item value
                int w = wt[i - 1];// ith item weight
                if (w <= j) {// valid
                    int incProfit = v + dp[i - 1][j - w];// include
                    int excProfit = dp[i - 1][j];// exclude
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        print(dp);
        return dp[n][W];
    }

    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        System.out.println(KnapsackRecursion(val, wt, W, val.length));
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(KnapsackMemoization(val, wt, W, val.length, dp));
        System.out.println(KnapsackTabulation(val, wt, W));
    }
}