//Write a pogram to implement priority queue for objects

import java.util.*;

public class PriorityQueueForObjects {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue<Student> pq = new PriorityQueue<>();
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 2));
        pq.add(new Student("B", 45));
        pq.add(new Student("C", 90));
        pq.add(new Student("D", 1));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
