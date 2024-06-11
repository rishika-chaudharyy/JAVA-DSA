
// You are given an integer 
// 𝑘
// k and a queue of integers. Your task is to reverse the order of the first 
// 𝑘
// k elements of the queue, leaving the other elements in the same relative order.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingFirstKElements {

    public static Queue<Integer> reverseFirstKElements(Queue<Integer> queue, int k) {
        // Base cases
        if (queue == null || k > queue.size() || k < 0) {
            return queue; // Return the original queue if k is out of valid range
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push the first k elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // Step 2: Add the elements from the stack back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3: Move the remaining elements (queue.size() - k) to the back of the
        // queue
        int remainingElements = queue.size() - k;
        for (int i = 0; i < remainingElements; i++) {
            queue.add(queue.remove());
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int k = 3;

        System.out.println("Original Queue: " + queue);
        Queue<Integer> modifiedQueue = reverseFirstKElements(queue, k);
        System.out.println("Modified Queue: " + modifiedQueue);
    }
}
