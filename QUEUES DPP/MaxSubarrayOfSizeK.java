// You are given an array arr[] of size N and an integer K. Your task is to find the maximum for each contiguous subarray of size K.

import java.util.Deque;
import java.util.LinkedList;

public class MaxSubarrayOfSizeK {

    static void printMax(int arr[], int n, int k) {
        Deque<Integer> deque = new LinkedList<>();

        // Process the first k elements
        for (int i = 0; i < k; i++) {
            // Remove elements smaller than the current element
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        // Process the rest of the elements
        for (int i = k; i < n; i++) {
            // The element at the front of the deque is the largest element of the previous
            // window
            System.out.print(arr[deque.peek()] + " ");

            // Remove the elements which are out of this window
            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.removeFirst();
            }

            // Remove elements smaller than the current element
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        // Print the maximum element of the last window
        System.out.print(arr[deque.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int k = 3;
        printMax(arr, arr.length, k);
    }
}
