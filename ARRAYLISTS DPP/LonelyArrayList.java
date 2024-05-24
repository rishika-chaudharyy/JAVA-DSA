//You are given an integer arraylist nums . A lonely number x is lonely when it appears only once and no adjacent numbers (x+1 and x-1) appear in the arraylist

import java.util.ArrayList;
import java.util.Collections;

public class LonelyArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        Collections.sort(nums);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            boolean isLonely = true;

            // Check if the current number is unique
            if ((i > 0 && nums.get(i) == nums.get(i - 1)) || (i < nums.size() - 1 && nums.get(i) == nums.get(i + 1))) {
                isLonely = false;
            }

            // Check if no adjacent numbers (x+1 or x-1) exist
            if ((i > 0 && nums.get(i) - 1 == nums.get(i - 1))
                    || (i < nums.size() - 1 && nums.get(i) + 1 == nums.get(i + 1))) {
                isLonely = false;
            }

            if (isLonely) {
                result.add(nums.get(i));
            }
        }

        System.out.println(result); // Use System.out.println to print the result
    }
}
