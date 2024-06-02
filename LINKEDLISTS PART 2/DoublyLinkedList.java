//Write a program to create a doubly linked list and perform basic operations

public class DoublyLinkedList {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if (size == 1) {
            head = tail = null;
            size = 0;
            return val;
        }

        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

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

    public int removeLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        int val = tail.data;
        if (size == 1) {
            head = tail = null;
            size = 0;
            return val;
        }

        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(23);
        dll.removeLast();
        dll.print(); // Output: 1 2
    }
}
