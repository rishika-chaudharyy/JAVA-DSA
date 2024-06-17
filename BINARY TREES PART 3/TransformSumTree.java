//Write a program to  transform tree to sum tree
//TC is O(n);
public class TransformSumTree {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        // Update the node's data to the sum of values in the left and right subtrees
        root.data = leftChild + rightChild;
        // Return the sum of values under this subtree including the current node's original value
        return data + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);

        // Print the transformed tree (optional, for verification)
        printInOrder(root);
    }

    // Helper function to print in-order traversal (optional, for verification)
    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        
        }
        System.out.print(root.data+" ");
        printInOrder(root.left);
        
        printInOrder(root.right);
    }
}
