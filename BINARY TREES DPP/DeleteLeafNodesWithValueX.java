// You are given a binary tree and a target integer x. Implement a function to delete all leaf nodes from the binary tree that have the value x. Additionally, delete any newly formed leaves that might have the value x after the initial deletion.

public class DeleteLeafNodesWithValueX {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node deleteLeaves(Node root, int x) {
        if (root == null) {
            return null;
        }

        // Recursively delete leaves with value x
        root.left = deleteLeaves(root.left, x);
        root.right = deleteLeaves(root.right, x);

        // Check if current node is a leaf and has value x
        if (root.left == null && root.right == null && root.data == x) {
            return null; // This node is a leaf with value x, delete it
        }

        // After deleting leaves, check if current node became a new leaf with value x
        if (root.left == null && root.right == null && root.data == x) {
            return null; // Return null to delete this newly formed leaf
        }

        return root;
    }

    // Utility function to print the tree (inorder traversal)
    public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        root.right.left = new Node(2);
        root.right.right = new Node(7);

        System.out.println("Original tree:");
        printTree(root);
        System.out.println();

        // Delete leaf nodes with value 2
        root = deleteLeaves(root, 2);

        System.out.println("Tree after deleting leaf nodes with value 2:");
        printTree(root);
        System.out.println();
    }
}
