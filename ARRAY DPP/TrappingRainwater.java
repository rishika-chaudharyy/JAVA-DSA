//Given a non-negative integer representing an elevation map where the width of each bar is 1 , compute how much water it can trap after raining.

public class TrappingRainwater {
    public static int waterTrapped(int heights[]) {
        int n = heights.length;

        // calculating left max boundary
        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundary[i] = Math.max(leftMaxBoundary[i - 1], heights[i]);
        }

        // calculating right max boundary
        int rightmaxBoundary[] = new int[n];
        rightmaxBoundary[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmaxBoundary[i] = Math.max(rightmaxBoundary[i + 1], heights[i]);
        }

        // calculating water level
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMaxBoundary[i], rightmaxBoundary[i]);
            trappedWater += (waterLevel - heights[i]);
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int heights[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(waterTrapped(heights));
    }
}
