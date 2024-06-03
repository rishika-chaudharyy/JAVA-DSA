// Given a linked list and two keys, we want to swap the nodes corresponding to these keys by changing their links. Swapping the data of nodes can be expensive in situations where the data contains many fields. We’ll assume that all keys in the linked list are distinct.

// Example
// Input: Linked list: 1 -> 2 -> 3 -> 4, keys: x = 2, y = 4
// Output: Linked list after swapping nodes: 1 -> 4 -> 3 -> 2
// Approach
// To swap nodes in a linked list without changing the data, we can follow these steps:

// Traverse the linked list to find the nodes corresponding to keys x and y.
// Keep track of the previous nodes for both x and y.
// Swap the next pointers of the previous nodes to link the nodes correctly.
public class SwappingNodes {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class LinkedList {
        Node head; // head of the list

        // Function to append a new node at the end of the list
        public void append(int new_data) {
            Node new_node = new Node(new_data);

            if (head == null) {
                head = new_node;
                return;
            }

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        // Function to print the linked list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("None");
        }

        // Function to swap nodes x and y in the linked list by changing links
        public void swapNodes(int x, int y) {
            // Nothing to do if x and y are the same
            if (x == y)
                return;

            // Search for x (keep track of prevX and currX)
            Node prevX = null, currX = head;
            while (currX != null && currX.data != x) {
                prevX = currX;
                currX = currX.next;
            }

            // Search for y (keep track of prevY and currY)
            Node prevY = null, currY = head;
            while (currY != null && currY.data != y) {
                prevY = currY;
                currY = currY.next;
            }

            // If either x or y is not present, return
            if (currX == null || currY == null)
                return;

            // If x is not the head of the linked list
            if (prevX != null) {
                prevX.next = currY;
            } else { // make y the new head
                head = currY;
            }

            // If y is not the head of the linked list
            if (prevY != null) {
                prevY.next = currX;
            } else { // make x the new head
                head = currX;
            }

            // Swap next pointers
            Node temp = currX.next;
            currX.next = currY.next;
            currY.next = temp;
        }
    }

    public static void main(String[] args) {
        SwappingNodes sn = new SwappingNodes();
        LinkedList llist = sn.new LinkedList();

        llist.append(1);
        llist.append(2);
        llist.append(3);
        llist.append(4);

        System.out.println("Original linked list:");
        llist.printList();

        llist.swapNodes(2, 4);

        System.out.println("Linked list after swapping nodes 2 and 4:");
        llist.printList();
    }
}
