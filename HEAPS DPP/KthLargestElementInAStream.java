// We have an infinite series of stream , find the kth largest element at any
// point of time

import java.util.*;

public class KthLargestElementInAStream {

    static List<Integer> getAllKthNumber(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];

            if (minHeap.size() < k) {
                minHeap.add(val);
            } else {
                if (val > minHeap.peek()) {
                    minHeap.remove(minHeap.peek());
                    minHeap.add(val);
                }
            }

            if (minHeap.size() >= k) {
                result.add(minHeap.peek());
            } else {
                result.add(-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int k = 4;
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        List<Integer> res = getAllKthNumber(arr, k);

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
