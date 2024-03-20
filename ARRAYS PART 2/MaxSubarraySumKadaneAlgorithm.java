//Write a program to calculate the maximum subarray sum using Kadane's Algorithm 
//Important test case: if all numbers are negative then return the smallest negative number

public class MaxSubarraySumKadaneAlgorithm {

    public static int kadaneAlgorithm(int array[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            currSum += array[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int array[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum subarray sum : " + kadaneAlgorithm(array));

    }
}
