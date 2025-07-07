// Question:- Delete N Nodes After M Nodes of a Linked List.

public class Problem_02 {
    
public static ListNode deleteNAfterM(ListNode head, int M, int N) {
    ListNode temp = head;

    while (temp != null) {
        
        for (int i = 1; i < M && temp != null; i++) {
            temp = temp.next;
        }

        // If end of list, break
        if (temp == null) break;

        // Start from next node
        ListNode temp2 = temp.next;

        // Delete N nodes
        for (int i = 0; i < N && temp2 != null; i++) {
            temp2 = temp2.next;
        }

        // Connect M-th node to (M+N+1)-th node
        temp.next = temp2;

        // Move to next segment
        temp = temp2;
    }

    return head;
}



    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp =  temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = new ListNode(7);
    head.next.next.next.next.next.next.next = new ListNode(8);

    int M = 3;
    int N = 2;

    System.out.println("Original List:");
    printList(head);

    // Call the function to delete N nodes after M nodes
    head = deleteNAfterM(head, M, N);

    System.out.println("Modified List:");
    printList(head);
}

}
