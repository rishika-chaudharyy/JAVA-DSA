//An arraylist is monotonic if it is either monotone increasing or monotone decreasing . An aaraylist is monotone increasing if for all i<=j nums.get(i)<=nums.get(j) and it is montone decreasing if for all i>=j nums.get(i)>= nums.get(j)

import java.util.ArrayList;

public class MonotonicArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(1);

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                isIncreasing = false;
            }

            if (nums.get(i) < nums.get(i + 1)) {
                isDecreasing = false;
            }
        }
        System.out.println(isIncreasing || isDecreasing);
    }
}