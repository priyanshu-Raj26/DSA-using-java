public class Problem_03 {

   public static ListNode SwapList(ListNode head, int x, int y) {
    if (x == y) return head;

    ListNode prevX = null, currX = head;
    while (currX != null && currX.val != x) {
        prevX = currX;
        currX = currX.next;
    }

    ListNode prevY = null, currY = head;
    while (currY != null && currY.val != y) {
        prevY = currY;
        currY = currY.next;
    }

    // If either x or y is not present, return head
    if (currX == null || currY == null)
        return head;

    // If x is not head of list
    if (prevX != null)
        prevX.next = currY;
    else // make y the new head
        head = currY;

    // If y is not head of list
    if (prevY != null)
        prevY.next = currX;
    else // make x the new head
        head = currX;

    // Swap next pointers
    ListNode temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;

    return head;
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

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        int x = 2;
        int y = 4;

        System.out.println("Original List: ");
        PrintList(head);


        head  = SwapList(head, x, y);

        System.out.println("After Swapping: ");
        PrintList(head);
    }
}
