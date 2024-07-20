//Write a program to convert string 1 to string 2 using insertion and deletion. Print the number of deletions and insertions made

public class StringConversion {
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < m + 1; i++) {
            dp[0][i] = 0;
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

    public static void stringConversion(String str1, String str2) {
        int lcs = lcs((str1), str2);
        int del = str1.length() - lcs;
        int insert = str2.length() - lcs;
        System.out.println(del);
        System.out.println(insert);
        System.out.println(del + insert);
    }

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        stringConversion(str1, str2);
    }
}
