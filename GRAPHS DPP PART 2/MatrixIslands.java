// Matrix Islands

// Given a matrix mat of size N x M where each cell represents a part of the
// island (1 represents land and 0 represents water), determine the number of
// islands in the matrix.

// Sample Input 1:
// N = 3, M = 3
// mat[][] = {
//   {1, 0, 0},
//   {0, 1, 0},
//   {0, 0, 1}
// }

// Sample Output 1:
// 1

// Sample Input 2:
// N = 5, M = 8
// mat[][] = {
//   {0, 0, 0, 0, 0, 0, 0, 1},
//   {0, 1, 1, 1, 1, 0, 0, 1},
//   {0, 1, 0, 1, 0, 0, 0, 1},
//   {0, 1, 1, 1, 1, 0, 1, 0},
//   {0, 0, 0, 0, 0, 0, 0, 1}
// }

// Sample Output 2:
// 2

import java.util.*;

public class MatrixIslands {

    static void dfs(int[][] matrix, boolean[][] visited, int x, int y, int n, int m, boolean[] hasCornerCell) {
        if (x < 0 || y < 0 || x >= n || y >= m || visited[x][y] || matrix[x][y] == 0) {
            return;
        }
        if (x == 0 || y == 0 || x == n - 1 || y == m - 1) {
            hasCornerCell[0] = true;
        }
        visited[x][y] = true;
        dfs(matrix, visited, x + 1, y, n, m, hasCornerCell);
        dfs(matrix, visited, x, y + 1, n, m, hasCornerCell);
        dfs(matrix, visited, x - 1, y, n, m, hasCornerCell);
        dfs(matrix, visited, x, y - 1, n, m, hasCornerCell);
    }

    static int countClosedIsland(int[][] matrix, int n, int m) {
        boolean[][] visited = new boolean[n][m];
        int result = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    boolean[] hasCornerCell = { false };
                    dfs(matrix, visited, i, j, n, m, hasCornerCell);
                    if (!hasCornerCell[0]) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5, M = 8;
        int[][] matrix = {
                { 0, 0, 0, 0, 0, 0, 0, 1 },
                { 0, 1, 1, 1, 1, 0, 0, 1 },
                { 0, 1, 0, 1, 0, 0, 0, 1 },
                { 0, 1, 1, 1, 1, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1 }
        };

        System.out.println(countClosedIsland(matrix, N, M));
    }
}
