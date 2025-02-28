public class Friends_Pairing {

    public static int Pairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // int single = Pairing(n-1);
        // int pair = single * Pairing(n-2);
        // return single + pair;
        
        return Pairing(n-1) + (n-1) * Pairing(n-2);
    }

    
    public static void main(String[] args) {
        System.out.println(Pairing(3));
    }
}
