// Maximum of all subarrays of size k.
// We have an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K

import java.util.*;

public class Problem_05 {

    public static void PrintSubarray(int N, int k, int arr[]) {
        Deque<Integer> dq = new LinkedList<>();
        
        for (int i = 0; i < N; i++) {
            // Remove indices out of the current window (from front)
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.poll();
            }
            // Remove indices of smaller elements (from back)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            // Add current element's index
            dq.offer(i);
            // If window has reached size k, print the maximum (arr[dq.peek()])
            if (i >= k - 1) {
                System.out.print(arr[dq.peek()] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int N = 9, k = 3;
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };

        PrintSubarray(N, k, arr);
    }
}
