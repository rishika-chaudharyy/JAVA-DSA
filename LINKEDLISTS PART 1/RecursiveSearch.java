//Search for a key in linked list . Return the position where it is found , if not found return -1. Use recursion
//TC is O(n) and Sc is O(n) because of call stacks
public class RecursiveSearch {
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

    public int removeFirst() {
        // special cases
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        size--;
        tail = prev;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        // base case
        if (head == null) {
            return -1;
        }

        // head is the key
        if (head.data == key) {
            return 0;
        }
        // search in head.next part
        int val = helper(head.next, key);

        // if that head.next part returns -1 , key not found totally
        if (val == -1) {
            return -1;
        }

        // key is found and idx will be +1 each time to get the correct index
        return val + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String args[]) {
        RecursiveSearch ll = new RecursiveSearch();
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
        ll.removeFirst();
        ll.printLinkedlist();
        ll.removeLast();
        ll.printLinkedlist();
        System.out.println(ll.size);
        System.out.println(ll.recSearch(2));
        System.out.println(ll.recSearch(9));
        System.out.println(ll.recSearch(10));

    }
}
