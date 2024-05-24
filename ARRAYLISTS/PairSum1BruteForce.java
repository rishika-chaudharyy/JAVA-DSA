//Find if any pair in a Sorted arrayList has a target sum
//brute force TC is O(N^2)

import java.util.ArrayList;

public class PairSum1BruteForce {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(i) + list.get(j)) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 50;
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }

        System.out.println(pairSum1(list, target));
    }
}
