//Write a program to reverse a doubly linkedlist
public class ReverseDoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void print() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        tail = head; // Update the tail to the original head
        head = prev; // Update the head to the last non-null node
    }

    public static void main(String[] args) {
        ReverseDoublyLL dll = new ReverseDoublyLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.print(); // Output: 1 2 3
        dll.reverse();
        dll.print(); // Output: 3 2 1
    }
}
