//A subsequence of a string is a new string generated from the original string with some character deleted without changing the relative order of the reamining characters

public class LCSRecursionMemoizationTabulation {
    public static int findLCSRecursion(String str1, String str2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return findLCSRecursion(str1, str2, n - 1, m - 1) + 1;
        } else {
            int ans1 = findLCSRecursion(str1, str2, n - 1, m);
            int ans2 = findLCSRecursion(str1, str2, n, m - 1);
            return Math.max(ans1, ans2);
        }
    }

    public static int findLCSMemoization(String str1, String str2, int n, int m) {
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return dp[n][m] = findLCSRecursion(str1, str2, n - 1, m - 1) + 1;
        } else {
            int ans1 = findLCSRecursion(str1, str2, n - 1, m);
            int ans2 = findLCSRecursion(str1, str2, n, m - 1);
            return dp[n][m] = Math.max(ans1, ans2);
        }

    }

    public static int findLCSTabulation(String str1, String str2, int n, int m) {
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        System.out.println(findLCSRecursion(str1, str2, str1.length(), str2.length()));
        System.out.println(findLCSMemoization(str1, str2, str1.length(), str2.length()));
        System.out.println(findLCSTabulation(str1, str2, str1.length(), str2.length()));
    }
}
