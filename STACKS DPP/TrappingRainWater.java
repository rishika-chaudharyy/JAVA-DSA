// You are given an array elevationMap of size N, where each element represents the elevation of a bar. The width of each bar is 1 unit. You need to compute how much water it is able to trap after raining.

// Write a function trapWater that takes in an integer array elevationMap and returns an integer representing the total amount of water trapped.
import java.util.Stack;

public class TrappingRainWater {

    // Computes the total amount of water trapped after raining given an array representing elevations of bars.
    // Parameters:
    // - elevationMap: An integer array representing the elevation of bars.
    // Returns:
    // - The total amount of water trapped.
    public static int trapWater(int[] elevationMap) {
        int n = elevationMap.length;

        int waterTrapped = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && elevationMap[i] > elevationMap[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = i - stack.peek() - 1;
                int boundedHeight = Math.min(elevationMap[i], elevationMap[stack.peek()]) - elevationMap[top];
                waterTrapped += distance * boundedHeight;
            }
            stack.push(i);
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        // Example usage
        int[] elevationMap = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 6 };
        System.out.println("Sample Output 1: " + trapWater(elevationMap));
    }
}
