// Beautiful ArrayList (MEDIUM)

// An ArrayList nums of size n is beautiful if:

// nums is a permutation of the integers in the range [1, n].
// For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums.get(k) == nums.get(i) + nums.get(j).
// Given the integer n, return any beautiful ArrayList nums of size n. There will be at least one valid answer for the given n.

// Sample Input 1:
// n = 4

// Sample Output 1:
// [2,1,4,3]

// Sample Input 2:
// n = 5

// Sample Output 2:
// [3,1,2,5,4]

// Constraints:

// 1 <= n <= 1000

import java.util.ArrayList;

public class BeautifulArrayList {
    public static ArrayList<Integer> generateBeautifulArrayList(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while (ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            int ans_size = ans.size();

            for (int i = 0; i < ans_size; i++) {
                if ((ans.get(i) * 2) - 1 <= n) {
                    temp.add((ans.get(i) * 2) - 1);
                }
            }
            for (int i = 0; i < ans_size; i++) {
                if ((ans.get(i) * 2) <= n) {
                    temp.add((ans.get(i) * 2));
                }
            }
            ans = temp;
        }
        return ans;
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.println(generateBeautifulArrayList(n));
    }
}
