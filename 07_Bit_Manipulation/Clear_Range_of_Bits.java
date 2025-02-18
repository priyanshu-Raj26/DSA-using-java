public class Clear_Range_of_Bits {

    public static int clearBitsinRange(int n, int i, int j) {
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int BitMask = a|b;
        return n & BitMask;
    }

    
    public static void main(String[] args) {
        System.out.println(clearBitsinRange(10,2,4));
    }
}
