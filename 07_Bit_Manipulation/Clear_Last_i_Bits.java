public class Clear_Last_i_Bits {
    
    public static int clearlastIthBit(int n, int i) {
        int BitMask = (~0)<<i;
        return n & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearlastIthBit(15,2));
    }
}
