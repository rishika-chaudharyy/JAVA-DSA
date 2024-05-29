//Write a program to print the size of the linked list
public class SizeLL {
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
    public static int size; // by default 0

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addInTheMiddle(int idx, int data) {
        // special case-> idx = 0 , add first operation
        if (idx == 0) {
            addFirst(data);
            return;
        }
        // create new node
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i=idx-1 that will be our previous index
        newNode.next = temp.next; // temp ka next is first pointing to idx that we want to insert
        temp.next = newNode;

    }

    public void printLinkedlist() {
        // linkedlist is empty
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

    public static void main(String args[]) {
        SizeLL ll = new SizeLL();
        ll.printLinkedlist();
        ll.addFirst(2);
        ll.printLinkedlist();
        ll.addFirst(1);
        ll.printLinkedlist();
        ll.addLast(3);
        ll.printLinkedlist();
        ll.addLast(4);
        ll.printLinkedlist();
        ll.addInTheMiddle(2, 9);
        ll.printLinkedlist();
        System.out.println(ll.size);

    }
}
