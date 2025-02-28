public class Optimized_Power {

    public static int optimizedPower(int x ,int n) { // O(logn)
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizedPower(x, n/2);
        int halfpowerSq = halfpower * halfpower;

        //n is odd
        if (n % 2 != 0) {
            halfpowerSq = x * halfpowerSq;
        }

        return halfpowerSq;
    }
    
    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        System.out.println(optimizedPower(x,n));
    }
}
