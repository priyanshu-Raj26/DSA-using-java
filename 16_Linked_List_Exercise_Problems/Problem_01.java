// Question:- Intersection of Two Linked Lists.
// Write a program to get the point where two linked lists merge.

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Problem_01 {


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Edge case: one or both lists are empty
        if (headA == null || headB == null) return null;

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        // Traverse until both pointers meet or both become null
        while (pointerA != pointerB) {
            // If pointerA reaches end, start from headB
            pointerA = (pointerA == null) ? headB : pointerA.next;

            // If pointerB reaches end, start from headA
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        // Either both are null (no intersection), or at intersection node
        return pointerA;
    }
public static void main(String[] args) {
        // Create nodes
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;

        ListNode intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection.");
        }
    }

}


