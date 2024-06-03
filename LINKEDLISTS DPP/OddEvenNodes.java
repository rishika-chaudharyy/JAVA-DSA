// Given a linked list of integers, rearrange the list such that all even numbers appear before all odd numbers, while preserving the relative order of even and odd numbers.

// Approach:
// We'll traverse the linked list once and segregate even and odd numbers into separate lists. Then, we'll combine these lists with even numbers appearing before odd numbers.
public class OddEvenNodes {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class LinkedList {
        Node head;

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

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        public void segregateEvenOdd() {
            if (head == null || head.next == null)
                return;

            Node evenStart = null, evenEnd = null;
            Node oddStart = null, oddEnd = null;
            Node current = head;

            while (current != null) {
                if (current.data % 2 == 0) {
                    if (evenStart == null) {
                        evenStart = current;
                        evenEnd = evenStart;
                    } else {
                        evenEnd.next = current;
                        evenEnd = evenEnd.next;
                    }
                } else {
                    if (oddStart == null) {
                        oddStart = current;
                        oddEnd = oddStart;
                    } else {
                        oddEnd.next = current;
                        oddEnd = oddEnd.next;
                    }
                }
                current = current.next;
            }

            if (evenStart == null || oddStart == null)
                return;

            evenEnd.next = oddStart;
            oddEnd.next = null;

            head = evenStart;
        }
    }

    public static void main(String[] args) {
        OddEvenNodes oddEvenNodes = new OddEvenNodes();
        OddEvenNodes.LinkedList llist = oddEvenNodes.new LinkedList();

        // Sample Input 1
        llist.append(8);
        llist.append(12);
        llist.append(10);
        llist.append(5);
        llist.append(4);
        llist.append(1);
        llist.append(6);

        System.out.println("Original linked list:");
        llist.printList();

        llist.segregateEvenOdd();

        System.out.println("Modified linked list:");
        llist.printList();
    }
}
