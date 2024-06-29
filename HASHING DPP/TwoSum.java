// Given an array of integers arr[] and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // diff = given target - number given at ith index
            int diff = target - arr[i];

            // check if found difference is present in the MAP list
            if (visited.containsKey(diff)) {
                // if difference in map matches with the ith index element in array
                return new int[] { visited.get(diff), i };
            }

            // add arr element in map to match with future element if forms a pair
            visited.put(arr[i], i);
        }

        // if no matches are found
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(arr, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
