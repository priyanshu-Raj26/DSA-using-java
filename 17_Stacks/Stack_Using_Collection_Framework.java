import java.util.*;

public class Stack_Using_Collection_Framework {
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();

        while (!s.isEmpty()) {
          System.out.println(s.pop());
        }
    }
}
