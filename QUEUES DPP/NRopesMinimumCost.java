//Given are N ropes of different lengths,the task is to connect these ropes in to one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.

import java.util.PriorityQueue;

public class NRopesMinimumCost {
    public static int minCost(int ropes[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int sec = pq.poll();
            cost += (first + sec);

            int newRope = first + sec;
            pq.add(newRope);
        }
        return cost;
    }

    public static void main(String args[]) {
        int ropes[] = { 4, 3, 2, 6 };
        System.out.println(minCost(ropes));
    }
}
