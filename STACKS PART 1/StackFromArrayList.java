//Write a program to implement stack using ArrayList

import java.util.ArrayList;

public class StackFromArrayList {

    static class Stack {
        ;
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty operation
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push operation O(1)
        public static void push(int data) {
            list.add(data);
        }

        // pop operation O(1)
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1); // last element will be top
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}