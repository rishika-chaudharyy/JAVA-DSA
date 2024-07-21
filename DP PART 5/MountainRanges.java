//At any moment number of down strokes must not be greater than upstrokes

public class MountainRanges {
    public static int mountainRanges(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            //i pairs-mountain ranges
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j]/*inside */ * dp[i - j - 1];/*outside */
            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(mountainRanges(n));
    }
}
