// Merge k Sorted ListsWe have K sorted linked lists of size N each, merge them and print the sorted output.Sample Input 1:k = 2, n =  2l1 = 1->3->NULLl2 = 6->8->NULLl3 = 9->10->NULLSample Output 1: 1>3->6->8->9->10->NULL
public class MergeKSortedLists {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node merge(Node l1, Node l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.data <= l2.data) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

    public Node mergeLists(Node[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        Node res = null;
        for (Node list : lists) {
            res = merge(res, list);
        }
        return res;
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeKSortedLists solution = new MergeKSortedLists();
        Node[] lists = new Node[3];

        // Sample Input
        lists[0] = new Node(1);
        lists[0].next = new Node(3);

        lists[1] = new Node(6);
        lists[1].next = new Node(8);

        lists[2] = new Node(9);
        lists[2].next = new Node(10);

        System.out.println("Sample Input:");
        for (int i = 0; i < lists.length; i++) {
            System.out.print("l" + (i + 1) + " = ");
            solution.printList(lists[i]);
        }

        Node mergedList = solution.mergeLists(lists);

        System.out.println("\nSample Output:");
        solution.printList(mergedList);
    }
}
