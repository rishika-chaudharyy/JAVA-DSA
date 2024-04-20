//Given an 2 X n board and tiles of size 2 X 1 , count the total number of ways to tile the given board using the 2 X 1 tiles (A tile can be either placed horizontally or vertically).

public class TilingProblem {
    public static int tilingProblemWays(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam

        // placing vertically
        int fnm1 = tilingProblemWays(n - 1);

        // placing horizontally
        int fnm2 = tilingProblemWays(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String args[]) {
        System.out.println(tilingProblemWays(4));
    }
}