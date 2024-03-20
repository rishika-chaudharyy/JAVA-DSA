//Write a program to calculate the maximum subarray sum using brute force approach

//TC is O(n^3)

public class MaxSubarraySumBruteForce {

    public static int maxSubarraySumBruteForce(int array[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += array[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int array[] = { 1, -2, 6, -1, 3 };
        System.out.println("The max subarray sum is " + maxSubarraySumBruteForce(array));
    }
}