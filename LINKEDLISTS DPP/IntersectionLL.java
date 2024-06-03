// Intersection of Two Linked Lists

// In a system, there are two singly linked lists. By some programming error, the end node of one of the linked lists got linked to the second list, forming an inverted Y-shaped list. Write a program to get the point where two linked lists merge.
// To solve this problem, we can use the following approach:

// Traverse both lists to get their lengths.
// Calculate the difference in lengths.
// Move the pointer of the longer list ahead by the difference in lengths.
// Traverse both lists simultaneously until a common node is found.

public class IntersectionLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getSize(Node head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public Node getIntersection(Node head1, Node head2) {
        int sizeA = getSize(head1);
        int sizeB = getSize(head2);

        // Advance the longer list by the difference in lengths
        while (sizeA > sizeB) {
            head1 = head1.next;
            sizeA--;
        }
        while (sizeB > sizeA) {
            head2 = head2.next;
            sizeB--;
        }

        // Traverse both lists simultaneously until a common node is found
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return null; // No intersection
    }

    public static void main(String[] args) {
        IntersectionLL ll = new IntersectionLL();

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(10);
        head2.next = new Node(11);
        head2.next.next = head1.next.next.next; // Merge point at node 4

        Node intersection = ll.getIntersection(head1, head2);

        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.data);
        } else {
            System.out.println("No intersection");
        }
    }
}
