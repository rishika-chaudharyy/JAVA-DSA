//Given an array nums of size n , return the majority element . The majority element is the element that appears more than (N/2) times . You may assume that the majority element always exists in the array

public class MajorityElement {
    public static int majorityElement(int nums[], int si, int ei) {
        if (si == ei) { // base case
            return nums[si];
        }
        // kaam
        int mid = si + (ei - si) / 2;
        int ansA = majorityElement(nums, si, mid); // majority from left side
        int ansB = majorityElement(nums, mid + 1, ei); // majority from right side

        // frequency of majority element
        int freqOfA = countOfMajorityElement(nums, si, ei, ansA);
        int freqOfB = countOfMajorityElement(nums, si, ei, ansB);

        if (freqOfA > freqOfB) {
            return ansA;
        } else {
            return ansB;
        }
    }

    public static int countOfMajorityElement(int nums[], int si, int ei, int target) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int nums[] = { 10, 10, 20, 10, 20, 30, 10, 30 };
        System.out.println(majorityElement(nums, 0, nums.length - 1));
    }
}
