public class Fibonacci {

    public static int calcfibo(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        
        int F1 = calcfibo(n-1);
        int F2 = calcfibo(n-2);
        // int F = Fnm1 + Fnm2;
        return F1+F2;
    }
    
    public static void main(String[] args) {
        int n = 7;

        System.out.println(calcfibo(n));
    }
}
