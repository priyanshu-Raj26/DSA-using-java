public class Problem_05 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Merge two sorted lists
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    // Merge k lists using divide and conquer
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        int last = lists.length - 1;

        while (last > 0) {
            int i = 0, j = last;

            while (i < j) {
                lists[i] = mergeTwoLists(lists[i], lists[j]);
                i++;
                j--;

                if (i >= j) last = j;
            }
        }

        return lists[0];
    }

    // Print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);

        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(8);

        ListNode l3 = new ListNode(9);
        l3.next = new ListNode(10);

        ListNode[] lists = {l1, l2, l3};

        ListNode merged = mergeKLists(lists);
        printList(merged);
    }

}