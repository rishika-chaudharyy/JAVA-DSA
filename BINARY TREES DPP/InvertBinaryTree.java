//Mirror of a tree is another binary tree with left and right children of the leaf node interchanged
//TC is O(n)
public class InvertBinaryTree {
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

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        // Recursively mirror the left and right subtrees
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        // Swap left and right children
        root.left = right;
        root.right = left;

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
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Original tree:");
        printTree(root);
        System.out.println();

        // Mirror the tree
        Node mirroredRoot = mirror(root);

        System.out.println("Mirrored tree:");
        printTree(mirroredRoot);
        System.out.println();
    }
}
