//Given a rod of length n inches and an array of prices that include prices of all peices smaller than n . Determine the max value obtained by cutting up the rod and selling the pieces
//TC is O(n*rodlength)
public class RodCutting {
    public static int rodCutting(int length[], int price[], int rodLength) {
        int n = length.length;
        int dp[][] = new int[n + 1][rodLength + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < rodLength + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < rodLength + 1; j++) {
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][rodLength];
    }

    public static void main(String[] args) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int rodLength = 8;

        System.out.println(rodCutting(length, price, rodLength));

    }
}
