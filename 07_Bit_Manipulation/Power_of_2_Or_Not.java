public class Power_of_2_Or_Not {

    public static boolean isPowerofTwo(int n) {
        return (n & (n-1)) == 0;
    }

    
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(8));
    }
}
