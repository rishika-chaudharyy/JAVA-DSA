//Write a program to calculate the maximum subarray sum using prefix sum approach

//TC ic O(n^2) which is better than brute force

public class MaxSubarraySumPrefixSum {
    public static int maxSubarraySumPrefixSum(int array[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefixSumArray[] = new int[array.length];

        // Calculating prefix sum array
        prefixSumArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int currSum = (i == 0) ? prefixSumArray[j] : prefixSumArray[j] - prefixSumArray[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int array[] = { 1, -2, 6, -1, 3 };
        System.out.println("The maximum subarray sum is " + maxSubarraySumPrefixSum(array));
    }
}
