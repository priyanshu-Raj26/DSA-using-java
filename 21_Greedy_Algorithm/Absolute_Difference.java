import java.util.Arrays;

public class Absolute_Difference {
    
    public static void main(String[] args) { //O(n logn)
        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        Arrays.sort(A);
        Arrays.sort(B);

        int MinDiff = 0;

        for (int i = 0; i < B.length; i++) {
            MinDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Min Absolute Diff of pairs = " + MinDiff);
    }
}
