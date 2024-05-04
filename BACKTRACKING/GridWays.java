//Find the number of ways to reach from 0,0 to n-1,m-1 in a MXN grid
//Allowed moves - right and down
//TC is O(2^(n+m))

public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) { // boundary cross condition
            return 0;
        }

        int w1Right = gridWays(i, j + 1, n, m);
        int w2Down = gridWays(i + 1, j, n, m);

        return w1Right + w2Down;

    }

    // grid ways by trick

    public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    public static void main(String args[]) {
        int n = 3;
        int m = 3;

        System.out.println(gridWays(0, 0, n, m));

        // formula for trick = (n-1+m-1)! / (n-1)! * (m-1)!
        int num = findFactorial((n - 1 + m - 1));
        int denom = findFactorial(n - 1) * findFactorial((m - 1));
        int result = num / denom;
        System.out.println("The total ways by trick formula in TC O(N) is " + result);
    }
}
