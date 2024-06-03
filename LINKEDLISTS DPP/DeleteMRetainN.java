// Given a linked list and two integers, M and N, traverse the linked list such that you retain M nodes, then delete the next N nodes. Continue this process until the end of the linked list.
// Examples:
// Input 1:
// M = 2, N = 2
// Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
// Output: Linked List: 1 -> 2 -> 5 -> 6
// Input 2:
// M = 3, N = 2
// Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
// Output: Linked List: 1 -> 2 -> 3 -> 6 -> 7 -> 8
public class DeleteMRetainN {
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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node deleteRetain(Node head, int m, int n) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            // Retain M nodes
            for (int i = 0; i < m && current != null; i++) {
                previous = current;
                current = current.next;
            }

            // Delete N nodes
            for (int i = 0; i < n && current != null; i++) {
                current = current.next;
            }

            // Link retained nodes to the next part
            if (previous != null) {
                previous.next = current;
            }
        }

        return head;
    }

    public static void main(String args[]) {
        DeleteMRetainN ll = new DeleteMRetainN();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);

        System.out.print("Original Linked List: ");
        ll.printLinkedList();

        head = deleteRetain(head, 2, 2);

        System.out.print("Modified Linked List: ");
        ll.printLinkedList();
    }
}
