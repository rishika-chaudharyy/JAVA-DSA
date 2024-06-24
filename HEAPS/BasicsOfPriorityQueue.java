//Write a program to implement priority queue using JCF

import java.util.*;

public class BasicsOfPriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(7);
        pq.add(70);

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}