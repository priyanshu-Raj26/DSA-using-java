import java.util.Stack;

public class Stock_Span_Problem {
    
    public static void StockSpan(int Stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < span.length; i++) {

            while (!s.isEmpty() && Stocks[i] > Stocks[s.peek()]) {
                s.pop();
            }

            if(!s.isEmpty()) {
                span[i] = i - s.peek();
            } else {
                span[i] = i + 1;
            }
            s.push(i);
        }
        return;
    }

    public static void main(String[] args) {
        int Stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[Stocks.length];
        StockSpan(Stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }
}
