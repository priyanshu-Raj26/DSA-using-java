// write a function that returns true if the given list is a palindrome, else false.

import java.util.Stack;

public class Problem_01 {

    static class ListNode {
        char data;
        ListNode next;

        ListNode(char x) {
            data = x;
            next = null;
        }
    }


    public static boolean isPalindrom(ListNode head) {
    Stack<Character> s = new Stack<>();

    ListNode temp = head, curr = head;
    int size = 0;
    while (temp != null) {
        size++;
        temp = temp.next;
    }

    // Push first half
    for (int i = 0; i < size / 2; i++) {
        s.push(curr.data);
        curr = curr.next;
    }

    // Skip middle node for odd length
    if (size % 2 != 0) {
        curr = curr.next;
    }

    // Compare second half with stack
    while (curr != null) {
        if (!s.pop().equals(curr.data)) {
            return false;
        }
        curr = curr.next;
    }

    return true;
}


    public static void main(String[] args) {
        ListNode head = new ListNode('A');
        head.next = new ListNode('B');
        head.next.next = new ListNode('C');
        head.next.next.next = new ListNode('B');
        head.next.next.next.next = new ListNode('A');

        if (isPalindrom(head)) {
            System.out.println("Yes it is palindrom");
        } else {
            System.out.println("No it is NOt a palindrom");
        }
    }
}