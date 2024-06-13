// Given an array Array[] of N elements and an integer K, where 1≤𝐾≤𝑁
// 1≤K≤N, the task is to split the given array into K subarrays such that they cover all the elements. The objective is to minimize the maximum sum among these K subarrays. Find that minimum possible maximum subarray sum.

public class MinimumPossibleMaximumSubarraySum {
    public static void main(String[] args) {
        int[] array = { 7, 2, 5, 10, 8 }; // Example input
        int k = 2;
        System.out.println(minimizeMaxSubarraySum(array, k));
    }

    public static int minimizeMaxSubarraySum(int[] nums, int k) {
        int left = Integer.MIN_VALUE, right = 0;
        for (int i = 0; i < nums.length; i++) {
            left = Math.max(left, nums[i]); // find the maximum element
            right += nums[i]; // calculate the total sum
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrayCount = 1;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentSum + nums[i] > maxSum) {
                subarrayCount++;
                currentSum = nums[i];
                if (subarrayCount > k) {
                    return false;
                }
            } else {
                currentSum += nums[i];
            }
        }

        return true;
    }
}
