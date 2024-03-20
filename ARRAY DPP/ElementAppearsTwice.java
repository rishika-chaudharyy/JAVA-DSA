//Given an integer array nums , return true if any value appears atnleast twice in the array and return false if every element is distinct

public class ElementAppearsTwice {
    public static boolean distinctElement(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 3, 4, 5, 6 };
        System.out.println(distinctElement(nums));
    }
}