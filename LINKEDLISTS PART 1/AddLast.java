//Write a program to create a add last method for a linked list
//TC is O(1)
public class AddLast {
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

    public void addlast(int data) {
        // create a new node
        Node newNode = new Node(data);

        // check if the linkedlist is empty-special case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // tail's next will point to new Node
        tail.next = newNode;

        // tail will become new node
        tail = newNode;
    }

    public static void main(String args[]) {
        AddLast ll = new AddLast();
        ll.addlast(1);
        ll.addlast(2);
    }
}
