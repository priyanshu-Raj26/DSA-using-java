public class Power_of_N {

    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int powfoN = Power(x,n-1);
        // int pow = x * Power(x, n-1);
        // return pow;

        return x * Power(x, n-1);
    }

    
    public static void main(String[] args) {

        System.out.println(Power(2,10));
    }
}
