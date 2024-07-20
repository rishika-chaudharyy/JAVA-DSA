//Given two strings word1 and word2 , return the minimum number of operations required to convert word1 to word2
//operations: insert, delete , replace
// TC is O(n*m)
public class EditDistance {
    public static int minOperations(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int ans1Add = dp[i][j - 1] + 1;
                    int ans2Delete = dp[i - 1][j] + 1;
                    int ans3Replace = dp[i - 1][j - 1] + 1;

                    dp[i][j] = Math.min(ans1Add, Math.min(ans2Delete, ans3Replace));
                }
            }
        }
        return dp[n][m];

    }

    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(minOperations(word1, word2));
    }
}
