// Given the root of a BST, transform it into a Greater Sum Tree where each node contains the sum of all nodes greater than that node.

public class TwoSumBST {
    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    static Node newNode(int key) {
        return new Node(key);
    }

    // Transform the BST into a greater sum tree
    static void transformToGreaterSumTree(Node root) {
        // Wrapper to hold the running sum
        int[] sum = new int[1];
        transformUtil(root, sum);
    }

    // Utility function for reverse in-order traversal
    static void transformUtil(Node node, int[] sum) {
        if (node == null) {
            return;
        }

        // Recur for the right subtree first
        transformUtil(node.right, sum);

        // Update the sum and node's key
        sum[0] += node.key;
        node.key = sum[0] - node.key;

        // Recur for the left subtree
        transformUtil(node.left, sum);
    }

    // Utility function to print the in-order traversal of the tree
    static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.key + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node root = newNode(11);
        root.left = newNode(2);
        root.right = newNode(29);
        root.left.left = newNode(1);
        root.left.right = newNode(7);
        root.right.left = newNode(15);
        root.right.right = newNode(40);
        root.right.right.left = newNode(35);

        System.out.println("In-order traversal of the original tree:");
        inorderTraversal(root);
        System.out.println();

        transformToGreaterSumTree(root);

        System.out.println("In-order traversal of the greater sum tree:");
        inorderTraversal(root);
    }
}
