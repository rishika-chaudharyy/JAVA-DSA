// An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

// You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

// To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

// Return the modified image after performing the flood fill.

//TC is O(mn)

import java.util.*;

public class FloodFillAlgorithm {
    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image.length || vis[sr][sc] || image[sr][sc] != orgColor) {
            return;
        }
        helper(image, sr, sc - 1, color, vis, orgColor);
        helper(image, sr, sc + 1, color, vis, orgColor);
        helper(image, sr - 1, sc, color, vis, orgColor);
        helper(image, sr + 1, sc, color, vis, orgColor);

    }

    public int[][] floddFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        
    }
}
