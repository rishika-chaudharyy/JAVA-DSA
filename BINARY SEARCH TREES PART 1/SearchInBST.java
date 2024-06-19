//Write a program to search in a BST
//TC is O(H)

public class SearchInBST {
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

    public static boolean searchInBST(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return searchInBST(root.left, key);
        } else {
            return searchInBST(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }

        if (searchInBST(root, 11)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

    }
}
