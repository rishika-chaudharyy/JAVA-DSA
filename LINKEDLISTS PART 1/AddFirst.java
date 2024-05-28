//Write a program to create addFirst method for a linked list
//TC is O(1)
public class AddFirst {
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

    // creating addFirst method
    public void addFirst(int data) {
        // creating a new Node
        Node newNode = new Node(data);

        // condition if linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // newNode's next will point to head's next
        newNode.next = head;

        // head will be newNode
        head = newNode;
    }

    public static void main(String args[]) {
        AddFirst ll = new AddFirst(); // creating a linked list
        ll.addFirst(2);
        ll.addFirst(1); // first in link 1 then 2
    }
}
