//Check if the binary tree is univalued
//TC is O(n)
public class UniValuedBinaryTree {
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

    public static boolean isUnivalued(Node root) {
        if (root == null) {
            return true;
        }

        // Check if the current node's value is different from its children's values
        if (root.left != null && root.data != root.left.data) {
            return false;
        }
        if (root.right != null && root.data != root.right.data) {
            return false;
        }

        // Recursively check if both subtrees are univalued
        return isUnivalued(root.left) && isUnivalued(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);

        System.out.println(isUnivalued(root)); // Output: true

        // Adding an example where the tree is not univalued
        root.right.right.data = 2;
        System.out.println(isUnivalued(root)); // Output: false
    }
}
