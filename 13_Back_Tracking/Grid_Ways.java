public class Grid_Ways {
    
    public static int Countways(int i, int j, int n, int m) {
        if (i == n-1 && j == m-1) {    // condn for last cell 
            return 1;
        } else if (i == n || j == m) {   // boundary cross condn
            return 0;
        }

        int w1 = Countways(i+1, j, n, m);
        int w2 = Countways(i, j+1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {  //O(2^n+m)
        int n = 3, m = 3;
        System.out.println(Countways(0,0,n,m));
    }
}
