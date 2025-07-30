import java.util.*;

public class Stack_Using_Two_Queue {
    
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void Push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {  //O(n)
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return-1;
            }
            int top = -1;

            //case 1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else { //case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        //peek
        public static int Peek() {  //O(n)
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return-1;
            }
            int top = -1;

            //case 1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else { //case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);

        while (!s.isEmpty()) {
            System.out.println(s.Peek());
            s.pop();
        }
    }
}
