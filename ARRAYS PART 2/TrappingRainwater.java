//Given a non-negative integers representing an elevation map where the width of each bar is 1 , compute how much water it can trap after raining

public class TrappingRainwater {
    public static int trappingRainwater(int heights[]) {

        int n = heights.length;

        // calculating the left max boundary
        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundary[i] = Math.max(leftMaxBoundary[i - 1], heights[i]);
        }

        // calculating the right max boundary
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(rightMaxBoundary[i + 1], heights[i]);
        }

        // calculating the water level for each bar
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            trappedWater += (waterLevel - heights[i]);
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Total water trapped : " + trappingRainwater(heights));
    }
}
