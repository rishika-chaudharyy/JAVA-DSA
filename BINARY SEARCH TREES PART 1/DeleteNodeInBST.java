//Write a porgam to delete a node in BST

public class DeleteNodeInBST {
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

    public static Node deleteNodeInBST(Node root, int val) {
        if (root.data > val) {
            root.left = deleteNodeInBST(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNodeInBST(root.right, val);
        } else {
            // case1 leaf-node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case2 single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case3 two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNodeInBST(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }

        inorder(root);
        System.out.println();
        root = deleteNodeInBST(root, 3);
        inorder(root);
    }
}
