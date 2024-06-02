//Write a program to detect and remove the cycle in a LL
public class RemoveCycleInLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        // Detect the cycle first
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        // Step 1: Detect the cycle using Floyd’s Cycle detection algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        // If no cycle is found, return
        if (!isCycle) {
            return;
        }

        // Step 2: Find the start of the cycle
        slow = head;
        Node prev = null; // To keep track of the previous node of 'fast'

        // Move both 'slow' and 'fast' one step at a time until they meet
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        // 'prev' is now the last node in the cycle
        prev.next = null; // Remove the cycle by pointing the last node to null
    }

    public static void main(String args[]) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // Creating a cycle

        System.out.println(detectCycle()); // Should print true
        removeCycle();
        System.out.println(detectCycle()); // Should print false
    }
}
