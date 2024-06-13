// Given two integers L and R, indicating a range of integers from L to R inclusive, and an integer K, the task is to find the Kth largest odd number in the given range. If 
// K is greater than the number of odd numbers in the range from L to R, return 0.

public class KthLargestOddNumber {
    public static void main(String args[]) {
        int l = -3;
        int r = 3;
        int x;
        int k = 1;
        int ans;
        if (r % 2 == 1) {
            x = r;
        } else {
            x = r - 1;
        }
        ans = x - 2 * (k - 1);

        if (ans < l) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}
