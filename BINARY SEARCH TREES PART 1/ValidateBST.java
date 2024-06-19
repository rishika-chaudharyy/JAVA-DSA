//Write a program to check if the BST is valid or not

public class ValidateBST {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static Node buildBST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = buildBST(root.left, val); // Corrected: Insert into the left subtree
        } else if (root.data < val) {
            root.right = buildBST(root.right, val); // Corrected: Insert into the right subtree
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String args[]) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }

        // inorder(root);
        if (isValidBST(root, null, null)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
