
//Given an integer array of size N , find all the elements that appear more then n/3 times;
//TC is O(n)
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // if (hm.containsKey(arr[i])) {
            // hm.put(arr[i], hm.get(arr[i]) + 1);
            // } else {
            // hm.put(arr[i], 1);
            // }

            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> keySet = hm.keySet();
        for (Integer key : keySet) {
            if (hm.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}
