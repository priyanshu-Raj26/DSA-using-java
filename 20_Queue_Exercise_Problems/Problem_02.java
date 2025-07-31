// Given are N ropes of different lengths, the task is to connect these ropes into one rope with 
//                                                minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.

import java.util.*;

public class Problem_02 {

    static int minCost(int n, int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        int res = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            pq.add(first + second);
        }
        
        return res;
    }

    public static void main(String[] args) {
        int N = 4;
        int arr[] = { 4, 3, 2, 6 };

        System.out.println(minCost(N, arr));
    }
}
