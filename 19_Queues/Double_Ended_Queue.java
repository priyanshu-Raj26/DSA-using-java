import java.util.*;

public class Double_Ended_Queue {
    
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);

        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first ele = " + deque.getFirst());
        System.out.println("Last ele = " + deque.getLast());

    }
}
