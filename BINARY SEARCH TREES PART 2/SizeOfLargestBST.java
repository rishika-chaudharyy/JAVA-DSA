//Write a program to find the size of largest BSt in a BT

public class SizeOfLargestBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int maxSizeBST = 0;

    public static Info largestBST(Node root) {
        // Base case: empty tree
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // Recursively get info from left and right subtrees
        Info left = largestBST(root.left);
        Info right = largestBST(root.right);

        // Current subtree's size
        int size = left.size + right.size + 1;

        // Minimum and maximum values in the current subtree
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        // Check if the current subtree is a BST
        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
            // Update the maxSizeBST if the current subtree is a larger BST
            maxSizeBST = Math.max(maxSizeBST, size);
            return new Info(true, size, min, max);
        }

        // If the current subtree is not a BST
        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largestBST(root);
        System.out.println("Size of the largest BST is: " + maxSizeBST);
    }
}
