//Write a program to reverse a Queue
//TC is O(n) and SC is O(n)

import java.util.*;

public class QueueReversal {
    public static void reversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            q.add(i);
        }
        reversal(q);
    }
}
