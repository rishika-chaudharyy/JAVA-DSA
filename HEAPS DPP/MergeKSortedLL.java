
// We have K linkedlists each of size N and each list is sorted in non-decreasing order,merge them into a singlesorted(non-decreasingorder)linkedlist and print the sorted linkedlist as output.

public class MergeKSortedLL {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class MergeKSortedLists {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0) {
                return null;
            }

            return mergeLists(lists, 0, lists.length - 1);
        }

        private ListNode mergeLists(ListNode[] lists, int left, int right) {
            if (left == right) {
                return lists[left];
            }

            int mid = left + (right - left) / 2;
            ListNode leftList = mergeLists(lists, left, mid);
            ListNode rightList = mergeLists(lists, mid + 1, right);

            return mergeTwoLists(leftList, rightList);
        }

        private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;

            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    current.next = l1;
                    l1 = l1.next;
                } else {
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }

            if (l1 != null) {
                current.next = l1;
            }

            if (l2 != null) {
                current.next = l2;
            }

            return dummy.next;
        }
    }

    public static void main(String[] args) {
        // Create sample linked lists
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7))));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)) /* Add more nodes here */);
        // ... Create other linked lists as needed

        ListNode[] lists = { list1, list2 /* Add more lists here */ };

        MergeKSortedLists merger = new MergeKSortedLists();
        ListNode mergedList = merger.mergeKLists(lists);

        // Print the merged list (for testing)
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}