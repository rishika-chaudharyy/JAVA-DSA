
//Write a program to fins if any pair in sorted arraylist has a target sum using two pointer approach 
//TC Iis O(n)
import java.util.ArrayList;

public class PairSum1TwoPointerApproach {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            if ((list.get(lp) + list.get(rp)) == target) {
                return true;
            }

            if ((list.get(lp) + list.get(rp)) > target) {
                rp--;
            } else {
                lp++;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        System.out.println(pairSum(list, target));
    }
}
