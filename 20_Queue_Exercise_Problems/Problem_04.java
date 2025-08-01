// Reversing the first K elements of a Queue.

import java.util.*;

public class Problem_04 {
    
    public static Queue<Integer> Reversing(int k, Queue<Integer> Q) {
        Stack<Integer> s = new Stack<>();
        int n = Q.size();

        for (int i = 0; i < k; i++) {
            s.push(Q.remove());
        }
        
        while (!s.isEmpty()) {
            Q.add(s.pop());
        }

        for (int i = 0; i < n-k; i++) {
            Q.add(Q.remove());
        }


        return Q;
    }

    public static void main(String[] args) {
        int k = 5;
        Queue<Integer> Q  = new LinkedList<>();
        Q.add(10);
        Q.add(20);
        Q.add(30);
        Q.add(40);
        Q.add(50);
        Q.add(60);
        Q.add(70);
        Q.add(80);
        Q.add(90);
        Q.add(100);


        Reversing(k, Q);

        while (!Q.isEmpty()) {
            System.out.print(Q.remove() + " ");
        }
    }
}
