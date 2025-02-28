public class Sum_of_N {

        public static int Sum(int n) {
            if (n == 1) {
                return 1;
            }

            int sNm1 = Sum(n-1);
            int sum = n + Sum(n-1);
            return sum;
        }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum(n));
    }
}
