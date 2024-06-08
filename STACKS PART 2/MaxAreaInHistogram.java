
//TC is O(n)
//Given ab array of integers height representing the histograms's bar height where the width of each bar is 1 , return the are of largest recatngle in the histogram
import java.util.Stack;

public class MaxAreaInHistogram {
    public static void maxAreaInHist(int height[]) {
        int maxArea = 0;
        int nsl[] = new int[height.length];
        int nsr[] = new int[height.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller left

        s = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Current area
        for (int i = 0; i < height.length; i++) {
            int heights = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = heights * width;
            maxArea = Math.max(currArea, maxArea);

        }

        System.out.println(maxArea);
    }

    public static void main(String args[]) {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        maxAreaInHist(height);
    }
}
