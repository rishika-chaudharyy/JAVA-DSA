//Check if the linked list is palindrome or not using stacks

import java.util.Stack;

public class PalindromicLLUsingStack {

    // Node class representing each node in the linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    public static Node head;

    // Method to check if the linked list is a palindrome
    public boolean checkPalindrome() {
        if (head == null) {
            return true; // An empty list is considered a palindrome
        }

        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        // Push all elements of the linked list onto the stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head; // Reset temp to the head of the list

        // Check elements from the beginning of the list against the stack
        while (temp != null) {
            int top = stack.pop();
            if (temp.data != top) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    // Method to add a new node at the end of the linked list
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public static void main(String[] args) {
        PalindromicLLUsingStack list = new PalindromicLLUsingStack();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 3 -> 2 -> 1
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);

        // Checking if the linked list is a palindrome
        boolean condition = list.checkPalindrome();
        System.out.println("Palindrome: " + condition);
    }
}
