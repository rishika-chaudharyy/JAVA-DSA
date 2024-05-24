// You are given an integer ArrayList nums. You are also given an integer key, which is present in nums. For every unique integer target in nums, count the number of times target immediately follows an occurrence of key in nums. In other words, count the number of indices i such that:

// 0 <= i <= nums.size() - 2,
// nums.get(i) == key, and
// nums.get(i + 1) == target.
// Return the target with the maximum count. (Assumption: the target with the maximum count is unique.)

// Sample Input 1:
// css
// Copy code
// nums = [1, 100, 200, 1, 100], key = 1
// Sample Output 1:
// Copy code
// 100
// Explanation: For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key. No other integers follow an occurrence of key, so we return 100.

// Sample Input 2:
// css
// Copy code
// nums = [2, 2, 2, 2, 3], key = 2
// Sample Output 2:
// Copy code
// 2
// Explanation: For target = 2, there are 3 occurrences at indices 1, 2, and 3 which follow an occurrence of key. For target = 3, there is only one occurrence at index 4 which follows an occurrence of key. Target = 2 has the maximum number of occurrences following an occurrence of key, so we return 2.

import java.util.ArrayList;

public class MostFrequentNumber {
    public static int mostFrequentNumber(ArrayList<Integer> nums, int key) {
        int count[] = new int[1001];

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                count[nums.get(i + 1)]++;
            }
        }

        int maxIndex = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        int key = 2;
        System.out.println(mostFrequentNumber(nums, key)); // Output: 2
    }
}
