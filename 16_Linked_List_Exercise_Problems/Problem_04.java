public class Problem_04 {

    public static ListNode OddEvenList(ListNode head) {

        ListNode evenDummy = new ListNode(0); // Dummy node for even list
        ListNode oddDummy = new ListNode(0); // Dummy node for odd list
        ListNode evenTail = evenDummy;
        ListNode oddTail = oddDummy;

        ListNode curr = head;
        while (curr != null) {
            if (curr.val % 2 == 0) {
                evenTail.next = curr;
                evenTail = evenTail.next;
            } else {
                oddTail.next = curr;
                oddTail = oddTail.next;
            }
            curr = curr.next;
        }

        evenTail.next = oddDummy.next; // Join odd list after even list
        oddTail.next = null; // End of list
        return evenDummy.next;
    }

    public static void PrintList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(8);
        head.next = new ListNode(12);
        head.next.next = new ListNode(10);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List");
        PrintList(head);

        head = OddEvenList(head);

        System.out.println("Modified List");
        PrintList(head);
    }
}
