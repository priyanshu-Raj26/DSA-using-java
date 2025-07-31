// Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.
import java.util.*;

public class Problem_01 {

    public static void main(String[] args) {
        int N = 5;
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 1; i <= N; i++) {
            String curr = q.remove();
            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}