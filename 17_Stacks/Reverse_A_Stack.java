import java.util.*;

public class Reverse_A_Stack {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void PrintStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {  //O(n)
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        PrintStack(s);

    }
}
