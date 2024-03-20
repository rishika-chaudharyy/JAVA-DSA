//There is an integer array nums sorted in ascending order(with distinct value).Prior to being passed to your function nums is possibly rotated at an unknown pivot index . Given the array nums after a possible rotation and ab integer target , return the index of target if it is in nums or -1 if it is not in nums .  
public class SortedRotatedSearch {
    public static int modifiedBinarySearch(int nums[], int key) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // searching
            if (nums[mid] == key) {
                return mid;
            }

            // search for left sorted or right sorted
            // conditon for left sorted
            if (nums[mid] >= nums[start]) {
                if (key >= nums[start] && key <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // this is for right sorted part
                if (key >= nums[mid] && key <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int key = 3;
        System.out.println(modifiedBinarySearch(nums, key));
    }
}
