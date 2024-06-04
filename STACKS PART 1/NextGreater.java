//Write a program  to find the next greater element , the next greater element of some element in an array is the first greater element that is to the right of the x in the same array

import java.util.Stack;

public class NextGreater {
    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}

// this is nextGreater right side
// for next greater left reverse the for loop
// for next smaller right reverse the condition in while loop
// for next smaller left reverse the condition in while loop and for loop also