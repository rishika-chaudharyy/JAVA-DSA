
// You are given a 2D grid grid of size m x n where each cell in the grid represents the cost to traverse through that cell. You need to find the minimum cost path from the top-left cell (0, 0) to the bottom-right cell (m-1, n-1). You can only move either down or right at any point in time.
import java.util.*;

class PathWithMinimumEffort {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        // Initialize a 2D array to keep track of the minimum effort to reach each cell
        int[][] minEffort = new int[m][n];

        // Initialize all values in minEffort to Integer.MAX_VALUE
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                minEffort[i][j] = Integer.MAX_VALUE;
            }
        }

        minEffort[0][0] = 0; // Starting point

        // Directions for moving down, right, up, and left
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        // Priority queue for Dijkstra's algorithm, manually implemented with a simple
        // list
        List<int[]> pq = new ArrayList<>();
        pq.add(new int[] { 0, 0, 0 }); // {effort, row, col}

        while (!pq.isEmpty()) {
            int[] top = pq.remove(0); // Get the element with the minimum effort
            int currentEffort = top[0];
            int r = top[1];
            int c = top[2];

            // If we reached the bottom-right corner, return the effort
            if (r == m - 1 && c == n - 1) {
                return currentEffort;
            }

            // If the current effort is already greater than the recorded minimum effort,
            // skip it
            if (currentEffort > minEffort[r][c]) {
                continue;
            }

            // Explore neighbors (down, right, up, left)
            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                    // Calculate the new effort to reach (nr, nc)
                    int newEffort = Math.max(currentEffort, Math.abs(heights[r][c] - heights[nr][nc]));

                    // If we found a less effort to reach (nr, nc), update minEffort and add to
                    // priority queue
                    if (newEffort < minEffort[nr][nc]) {
                        minEffort[nr][nc] = newEffort;
                        pq.add(new int[] { newEffort, nr, nc });
                    }
                }
            }

            // Sort the priority queue by effort (not required for Dijkstra's correctness,
            // but for simplicity)
            pq.sort((a, b) -> a[0] - b[0]);
        }

        // If we somehow reach here, return 0 (though we should always reach the
        // destination)
        return 0;
    }
}
